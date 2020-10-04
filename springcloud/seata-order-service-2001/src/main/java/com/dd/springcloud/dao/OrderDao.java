package com.dd.springcloud.dao;

import com.dd.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Package: com.dd.springcloud.dao
 * @ClassName: Userdao
 * @Author: 东方不败
 * @CreateTime: 2020-10-02 19:03
 * @Description:
 */
@Mapper
public interface OrderDao {

    //新建订单
    void create(Order order);

    //修改订单状态，从0改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);

}
