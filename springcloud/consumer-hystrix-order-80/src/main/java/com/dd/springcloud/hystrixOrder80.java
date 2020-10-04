package com.dd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Package: com.dd.springcloud
 * @ClassName: hystrixOrder80
 * @Author: 东方不败
 * @CreateTime: 2020-09-20 12:04
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
public class hystrixOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(hystrixOrder80.class, args);
    }
}
