package com.dd.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.dd.springcloud.dao"})
public class MyBatisConfig {
}