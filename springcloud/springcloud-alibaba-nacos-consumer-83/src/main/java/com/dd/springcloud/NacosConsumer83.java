package com.dd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Package: com.dd.springcloud
 * @ClassName: d
 * @Author: 东方不败
 * @CreateTime: 2020-09-29 10:43
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumer83 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumer83.class, args);
    }

}