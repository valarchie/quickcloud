package com.valarchie.quickcloud.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
* description: 订单控制器
* @author: valarchie
* on: 2020/5/26
* @email: 343928303@qq.com
*/
@RestController("/order")
public class OrderController {

    @RequestMapping("/put")
    public Map order() {

        System.out.println("put one order on");

        return new HashMap();
    }


}