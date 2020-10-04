package com.dd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Package: com.dd.springcloud
 * @ClassName: PaymentMain8001
 * @Author: 东方不败
 * @CreateTime: 2020-09-14 17:00
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8003 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8003.class, args);
    }
}
