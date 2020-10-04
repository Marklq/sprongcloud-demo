package com.dd.springcloud.service;

import com.dd.springcloud.domain.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Package: com.dd.springcloud.service
 * @ClassName: AccountService
 * @Author: 东方不败
 * @CreateTime: 2020-10-02 19:45
 * @Description:    account微服务调用
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {

    @PostMapping("/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);


}
