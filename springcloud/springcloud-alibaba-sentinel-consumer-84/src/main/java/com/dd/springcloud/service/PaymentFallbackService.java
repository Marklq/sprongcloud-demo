package com.dd.springcloud.service;

import com.dd.springcloud.entity.CommonResult;
import com.dd.springcloud.entity.Payment;
import org.springframework.stereotype.Component;

/**
 * @auther zzyy
 * @create 2020-02-25 18:30
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(
                44444,
                "服务降级返回,---PaymentFallbackService",
                new Payment(id, "errorSerial")
        );
    }
}
