package com.dd.springcloud.controller;

import com.dd.springcloud.service.ISendService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Package: com.dd.springcloud.controller
 * @ClassName: SendMessageController
 * @Author: 东方不败
 * @CreateTime: 2020-09-27 17:53
 * @Description:
 */
@RestController
public class SendMessageController {

    @Resource
    private ISendService service;

    @GetMapping("/sendmessage")
    public String sendMessage() {
        return service.send();

    }

}
