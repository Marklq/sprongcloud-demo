package com.dd.springcloud.controller;

import com.dd.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Package: com.dd.springcloud.controller
 * @ClassName: ConsumerController
 * @Author: 东方不败
 * @CreateTime: 2020-09-20 12:07
 * @Description:
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_timeOutHandler")
public class ConsumerController {

    @Resource
    private PaymentHystrixService service;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
//    @HystrixCommand
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
//        int i = 10 / 0;
        String result = service.paymentInfo_OK(id);
        return result;
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    })
    public String paymentTimeOut(@PathVariable("id") Integer id) {
        return service.paymentInfo_TimeOut(id);
    }

    public String paymentTimeOutFallbackMethod(@PathVariable("id") Integer id) {
        return "我是消费者80,对方支付系统繁忙请10秒种后再试或者自己运行出错请检查自己,o(╥﹏╥)o";
    }

    //全局的fallback方法
    public String payment_Global_timeOutHandler() {
        return "全局降级处理方案o(╥﹏╥)o";
    }


}
