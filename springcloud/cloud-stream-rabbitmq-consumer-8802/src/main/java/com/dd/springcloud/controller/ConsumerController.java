package com.dd.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @Package: com.dd.springcloud.controller
 * @ClassName: ConsumerController
 * @Author: 东方不败
 * @CreateTime: 2020-09-28 9:11
 * @Description:
 */
@Component
@EnableBinding(Sink.class)
public class ConsumerController {

    @Value("${server.port}")
    private String ServerPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        System.out.println("消费者1号,----->接受到的消息: " + message.getPayload() + "\t  port: " + ServerPort);
    }


}
