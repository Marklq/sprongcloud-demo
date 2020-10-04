package com.dd.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: com.dd.springcloud.controller
 * @ClassName: PaymentController
 * @Author: 东方不败
 * @CreateTime: 2020-09-29 10:03
 * @Description:
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/nacos/{id}")
    public String payment(@PathVariable Integer id) {
        return "hello,Nacos !!!!!!!!!!" + "serverPort:" + serverPort + "============id:" + id;
    }

}
