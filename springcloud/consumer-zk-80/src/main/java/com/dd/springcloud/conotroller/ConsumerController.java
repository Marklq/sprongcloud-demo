package com.dd.springcloud.conotroller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Package: com.dd.springcloud.conotroller
 * @ClassName: ConsumerController
 * @Author: 东方不败
 * @CreateTime: 2020-09-16 16:59
 * @Description:
 */
@RestController
@Slf4j
public class ConsumerController {
    public static final String INVOKE_URL = "http://cloud-provider-payment";
    @Resource
    private RestTemplate restTemplate;

    public ConsumerController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    /**
     * http://localhost/consumer/payment/zk
     *
     * @return
     */
    @GetMapping("/consumer/payment/zk")
    public String paymentInfo() {
        return restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
    }


}
