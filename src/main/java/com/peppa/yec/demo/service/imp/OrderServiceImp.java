package com.peppa.yec.demo.service.imp;

import com.peppa.yec.demo.mapper.OrderFormMapper;
import com.peppa.yec.demo.pojo.OrderForm;
import com.peppa.yec.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zyf
 */
@Service
public class OrderServiceImp implements OrderService {
    @Autowired
    OrderFormMapper orderFormMapper;
    @Override
    public OrderForm findByOrderId(Integer orderId) {
        return orderFormMapper.findByOrderId(orderId);
    }
}
