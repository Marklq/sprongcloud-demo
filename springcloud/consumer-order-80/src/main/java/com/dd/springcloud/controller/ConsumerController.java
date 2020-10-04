package com.dd.springcloud.controller;


import com.dd.springcloud.entity.CommonResult;
import com.dd.springcloud.entity.Payment;
import com.dd.springcloud.lb.LoadBalancer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @Package: com.dd.springcloud.controller
 * @ClassName: ConsumerController
 * @Author: 东方不败
 * @CreateTime: 2020-09-14 21:37
 * @Description:
 */
@RestController
public class ConsumerController {

    //private static final String MY_URL = "http://localhost:8001";
    private static final String MY_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    //自定义负载均衡
    @Resource
    private LoadBalancer loadBalancer;

    //服务发现
    @Resource
    private DiscoveryClient discoveryClient;

    //RestTemplate中getForObject方法
    @GetMapping("/consumer/payment/create")
    public CommonResult create(Payment payment) {
        return restTemplate.postForObject(MY_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult selectById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(MY_URL + "/payment/get/" + id, CommonResult.class);
    }


    //RestTemplate中getForEntity方法
    @GetMapping("/consumer/payment/getForEntity/{id}")
    public CommonResult<Payment> getPayment2(@PathVariable("id") Long id) {
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(MY_URL + "/payment/get/" + id, CommonResult.class);

        if (entity.getStatusCode().is2xxSuccessful()) {
            return entity.getBody();
        } else {
            return new CommonResult<>(444, "操作失败");
        }
    }

    @GetMapping("/consumer/payment/getForEntity/create")
    public CommonResult<Payment> create2(Payment payment) {
        ResponseEntity<CommonResult> entity = restTemplate.postForEntity(MY_URL + "/payment/create", payment, CommonResult.class);

        if (entity.getStatusCode().is2xxSuccessful()) {
            return entity.getBody();
        } else {
            return new CommonResult<>(444, "操作失败");
        }
    }


    //自定义负载均衡测试
    @GetMapping(value = "/consumer/payment/lb")
    public String getPaymentLB() {
        //发现服务
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");

        if (instances == null || instances.size() <= 0) {
            return null;
        }
        //获取服务URl
        ServiceInstance serviceInstance = loadBalancer.instances(instances);
        URI uri = serviceInstance.getUri();
        //转发URl
        return restTemplate.getForObject(uri + "/payment/lb", String.class);
    }

    //    zipkin
    @GetMapping("/consumer/payment/zipkin")
    public String ZipKin() {
        return restTemplate.getForObject("http://localhost:8001" + "/payment/zipkin/", String.class);
    }
}
