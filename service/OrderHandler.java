package com.example.demo.service;


import com.example.demo.entities.Order;

/**
 * @author : Devin
 * @date : 2020/6/25
 */
public interface OrderHandler {
    void handle(Order order);
}
