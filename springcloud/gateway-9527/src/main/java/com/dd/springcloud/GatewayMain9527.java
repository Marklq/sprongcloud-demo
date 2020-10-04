package com.dd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Package: com.dd.springcloud
 * @ClassName: GatewayMain9527
 * @Author: 东方不败
 * @CreateTime: 2020-09-20 21:54
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayMain9527 {

    public static void main(String[] args) {
        SpringApplication.run(GatewayMain9527.class,args);
    }

}