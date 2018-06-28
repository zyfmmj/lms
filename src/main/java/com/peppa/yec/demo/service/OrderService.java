package com.peppa.yec.demo.service;

import com.peppa.yec.demo.mapper.OrderFormMapper;
import com.peppa.yec.demo.pojo.OrderForm;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zyf
 */
public interface OrderService {

    /**
     * 根据订单号查找对应订单信息
     * @param orderId
     * @return
     */
    OrderForm findByOrderId(Integer orderId);

}
