package com.dd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Package: com.dd.springcloud
 * @ClassName: ConfigConsumer3355
 * @Author: 东方不败
 * @CreateTime: 2020-09-22 9:53
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigConsumer3366 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigConsumer3366.class,args);
    }
}
