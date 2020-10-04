package com.dd.springcloud.service.impl;

import com.dd.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @Package: com.dd.springcloud.service.impl
 * @ClassName: HystrixFallbackService
 * @Author: 东方不败
 * @CreateTime: 2020-09-20 16:35
 * @Description:
 */
@Component
public class HystrixFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "HystrixFallbackService中进行了paymentInfo_OK降级处理";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "HystrixFallbackService中进行了paymentInfo_TimeOut降级处理";
    }
}
