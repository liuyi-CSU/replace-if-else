package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

/**
 * @author : Devin
 * @date : 2020/6/25
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface OrderHandlerType {
    String source();
    String payMethod();
}
