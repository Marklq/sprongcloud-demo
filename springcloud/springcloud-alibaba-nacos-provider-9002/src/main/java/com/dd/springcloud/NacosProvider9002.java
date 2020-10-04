package com.dd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Package: com.dd.springcloud
 * @ClassName: Nacos
 * @Author: 东方不败
 * @CreateTime: 2020-09-29 10:12
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvider9002 {

    public static void main(String[] args) {
        SpringApplication.run(NacosProvider9002.class, args);
    }

}