package com.dd.springcloud.service;

import com.dd.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Package: com.dd.springcloud.service
 * @ClassName: PaymentService
 * @Author: 东方不败
 * @CreateTime: 2020-09-14 19:51
 * @Description:
 */
public interface PaymentService {

    int create(Payment payment);

    Payment selectById(@Param("id") Long id);


}
