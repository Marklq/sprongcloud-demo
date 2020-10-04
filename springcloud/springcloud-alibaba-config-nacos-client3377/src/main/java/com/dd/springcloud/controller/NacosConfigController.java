package com.dd.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: com.dd.springcloud.controller
 * @ClassName: d
 * @Author: 东方不败
 * @CreateTime: 2020-09-29 11:31
 * @Description:
 */
@RestController
@RefreshScope//支持Nacos的动态刷新功能。
public class NacosConfigController {
    @Value("${config.info}")
    private String configInfo;

    @Value("${server.port}")
    private String sereverPort;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return "serverPort:"+sereverPort+"ConfigInfo:"+ configInfo;
    }
}
