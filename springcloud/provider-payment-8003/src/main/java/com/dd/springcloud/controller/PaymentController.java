package com.dd.springcloud.controller;

import com.dd.springcloud.entity.CommonResult;
import com.dd.springcloud.entity.Payment;
import com.dd.springcloud.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Package: com.dd.springcloud.controller
 * @ClassName: PaymentController
 * @Author: 东方不败
 * @CreateTime: 2020-09-14 19:54
 * @Description:
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentServiceImpl service;

    @Value("${server.port}")
    private String serverPort;

    //插入数据
    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = service.create(payment);
        log.info("===============插入结果：" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据成功,serverPort:" + serverPort, result);
        } else {
            return new CommonResult(444, "插入数据失败", null);
        }
    }


    //插入数据
    @GetMapping("/payment/get/{id}")
    public CommonResult selectById(@PathVariable("id") Long id) {

        Payment payment = service.selectById(id);
        log.info("===============插入结果：" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功,serverPort:" + serverPort, payment);
        } else {
            return new CommonResult(444, "查询失败", null);
        }
    }

    //手写轮询
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }


}
