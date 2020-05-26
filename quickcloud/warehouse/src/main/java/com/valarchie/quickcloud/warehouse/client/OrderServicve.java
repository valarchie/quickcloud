package com.valarchie.quickcloud.warehouse.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
* description: 订单服务远程调用
* @author: valarchie
* on: 2020/5/26
* @email: 343928303@qq.com
*/
@Component
@FeignClient(name = "order-service")
public interface OrderServicve {

    @RequestMapping("/order/put")
    Map putOrder();

}