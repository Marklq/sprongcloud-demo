package com.dd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Package: com.dd.springcloud
 * @ClassName: SentinelPaymentMain9003
 * @Author: 东方不败
 * @CreateTime: 2020-10-02 9:59
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelPaymentMain9003 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelPaymentMain9003.class, args);
    }
}
