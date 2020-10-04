package com.dd.springcloud.controller;

import com.dd.springcloud.domain.CommonResult;
import com.dd.springcloud.domain.Order;
import com.dd.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Package: com.dd.springcloud.controller
 * @ClassName: OrderController
 * @Author: 东方不败
 * @CreateTime: 2020-10-02 19:58
 * @Description:
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "创建订单成功");
    }

}
