package com.dd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Package: com.dd.springcloud
 * @ClassName: ConfigMain3377
 * @Author: 东方不败
 * @CreateTime: 2020-09-29 11:32
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigMain3377 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigMain3377.class, args);
    }
}
