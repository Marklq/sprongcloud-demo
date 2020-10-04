package com.dd.springcloud.service.impl;

import com.dd.springcloud.dao.PaymentDao;
import com.dd.springcloud.entity.Payment;
import com.dd.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Package: com.dd.springcloud.service.impl
 * @ClassName: PaymentServiceImpl
 * @Author: 东方不败
 * @CreateTime: 2020-09-14 19:51
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {

        return paymentDao.create(payment);
    }

    @Override
    public Payment selectById(Long id) {
        return paymentDao.selectById(id);
    }
}
