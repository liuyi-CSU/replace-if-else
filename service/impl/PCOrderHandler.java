package com.example.demo.service.impl;

import com.example.demo.entities.Order;
import com.example.demo.service.OrderHandler;
import com.example.demo.service.OrderHandlerType;
import org.springframework.stereotype.Component;

/**
 * @author : Devin
 * @date : 2020/6/25
 */
@OrderHandlerType(source = "pc",payMethod = "order")
@Component
public class PCOrderHandler implements OrderHandler {
    @Override
    public void handle(Order order) {
        System.out.println("处理PC端订单");
    }
}
