package com.dd.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @auther zzyy
 * @create 2020-02-19 20:31
 */
public interface LoadBalancer {
    //使用这个接口去发现注册的服务有哪些
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
