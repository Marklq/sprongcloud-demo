package com.dd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Package: com.dd.springcloud
 * @ClassName: ConsulPaymentMain8004
 * @Author: 东方不败
 * @CreateTime: 2020-09-16 22:59
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulPaymentMain8005 {
    public static void main(String[] args) {
    SpringApplication.run(ConsulPaymentMain8005.class,args);

    }
}
