package com.valarchie.quickcloud.warehouse.controller;

import com.valarchie.quickcloud.warehouse.client.OrderServicve;
import org.springframework.beans.factory.annotation.Autowired;
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
@RestController("/warehouse")
public class WarehouseController {


    @Autowired
    private OrderServicve orderServicve;

    @RequestMapping("/put")
    public Map order() {

        System.out.println("consuming one product");
        orderServicve.putOrder();


        System.out.println("consume one product is done");


        return new HashMap();
    }


}