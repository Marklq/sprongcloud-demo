package com.dd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Package: com.dd.springcloud
 * @ClassName: HystrixDashboard9001
 * @Author: 东方不败
 * @CreateTime: 2020-09-20 20:58
 * @Description:
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard9001 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9001.class, args);
    }

}
