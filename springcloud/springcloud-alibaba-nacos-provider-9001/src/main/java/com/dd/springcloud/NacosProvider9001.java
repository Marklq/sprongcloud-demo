package com.dd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Package: com.dd.springcloud
 * @ClassName: NacosProvider9001
 * @Author: 东方不败
 * @CreateTime: 2020-09-29 9:59
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvider9001 {

    public static void main(String[] args) {
        SpringApplication.run(NacosProvider9001.class,args);
    }

}
