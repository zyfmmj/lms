package com.peppa.yec.demo.controller;

import com.alibaba.fastjson.JSON;
import com.peppa.yec.demo.pojo.OrderForm;
import com.peppa.yec.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.json.Json;

/**
 * @author zyf
 */
@Controller
public class OrderController {


    @Autowired
    OrderService orderService;

    @RequestMapping("/searchOrder")
    @ResponseBody
    public String searchOrder(
            Integer orderId
    ){
        OrderForm orderForm = orderService.findByOrderId(orderId);

        String orderFormJson = JSON.toJSONString(orderForm);

        return orderFormJson;

    }

}
