package com.dd.springcloud.service;

import com.dd.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Package: com.dd.springcloud.service
 * @ClassName: StorageService
 * @Author: 东方不败
 * @CreateTime: 2020-10-02 19:37
 * @Description: storage微服务调用
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
