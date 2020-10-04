package com.dd.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Package: com.dd.springcloud.controller
 * @ClassName: SentinelController
 * @Author: 东方不败
 * @CreateTime: 2020-09-30 9:01
 * @Description:
 */
@RestController
@Slf4j
public class SentinelController {

    @GetMapping("/testa")
    public String TestA() {
/*        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return "TestA";
    }


    @GetMapping("/testb")
    public String TestB() {
        return "TestB";
    }


    @GetMapping("/testd")
    public String TestD() {
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        int i = 10 / 0;
        log.info("TestD,测试RT");
        return "TestD";
    }

    @GetMapping("/teste")
    public String TestE() {
        int i = 10 / 0;
        log.info("TestE,测试异常数");
        return "TestE";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "del_testHotkey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2) {
        return "testHotKey";
    }

    public String del_testHotkey(String p1, String p2, BlockException exception) {
        return "del_testHotkey";
    }


}
