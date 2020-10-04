package com.dd.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Package: com.dd.springcloud.config
 * @ClassName: RestTemplateConfig
 * @Author: 东方不败
 * @CreateTime: 2020-09-14 21:35
 * @Description:
 */
@Configuration
public class ApplicationContext {

    @Bean
//    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
