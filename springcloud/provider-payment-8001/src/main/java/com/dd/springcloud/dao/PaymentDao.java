package com.dd.springcloud.dao;

import com.dd.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Package: com.dd.springcloud.dao
 * @ClassName: PaymentDao
 * @Author: 东方不败
 * @CreateTime: 2020-09-14 19:32
 * @Description:
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment selectById(@Param("id") Long id);

}
