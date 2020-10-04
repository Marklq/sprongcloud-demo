package com.dd.springcloud.service.Impl;

import com.dd.springcloud.dao.OrderDao;
import com.dd.springcloud.domain.Order;
import com.dd.springcloud.service.AccountService;
import com.dd.springcloud.service.OrderService;
import com.dd.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Package: com.dd.springcloud.service.Impl
 * @ClassName: OrderServiceImpl
 * @Author: 东方不败
 * @CreateTime: 2020-10-02 19:33
 * @Description:
 */

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    //下订单 -> 减库存 -> 减余额 -> 改状态
    @Override
    @GlobalTransactional(name = "dd", rollbackFor = Exception.class)//name就是一个唯一ID，不能重复
    public void create(Order order) {

        log.info("===========开始创建订单============");
        orderDao.create(order);

        log.info("===========开始减少库存============");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("===========结束减少库存============");

        log.info("===========开始减少账户余额============");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("===========结束减少账户余额============");

        // 修改订单状态，从零到1,1代表已经完成
        log.info("----->修改订单状态开始");
        orderDao.update(order.getUserId(), 0);
        log.info("----->修改订单状态结束");

        log.info("===========创建订单结束============");

    }
}
