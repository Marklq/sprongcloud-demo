package com.dd.springcloud.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Package: com.dd.springcloud.service
 * @ClassName: SendServiceImpl
 * @Author: 东方不败
 * @CreateTime: 2020-09-27 17:06
 * @Description:
 */
@EnableBinding(Source.class)//定义消息的推送管道
//指信道channel和exchange绑定在一起    不再使用@Service
public class SendServiceImpl implements ISendService {

    @Resource
    private MessageChannel output;

    @Override
    public String send() {

        String serial = UUID.randomUUID().toString();

        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("serial:" + serial);
        return null;


    }
}
