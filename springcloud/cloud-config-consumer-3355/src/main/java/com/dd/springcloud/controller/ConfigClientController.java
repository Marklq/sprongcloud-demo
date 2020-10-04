package com.dd.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: com.dd.springcloud.controller
 * @ClassName: f
 * @Author: 东方不败
 * @CreateTime: 2020-09-22 9:54
 * @Description:
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;

    @Value("${server.port}")
    private String sereverPort;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return "serverPort:"+sereverPort+"ConfigInfo:"+ configInfo;
    }
}
