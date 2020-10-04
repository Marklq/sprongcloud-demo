package com.dd.springcloud;

import com.dd.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Package: com.dd.springcloud
 * @ClassName: ConsumerMain80
 * @Author: 东方不败
 * @CreateTime: 2020-09-14 21:32
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class ConsumerMain80 {
        public static void main(String[] args) {
        SpringApplication.run(ConsumerMain80.class, args);
    }
}
