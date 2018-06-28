package com.peppa.yec.demo.mapper;

import com.peppa.yec.demo.pojo.OrderForm;

/**
 * @author zyf
 */
public interface OrderFormMapper {

    /**
     * 根据 orderId 查找记录
     * @param orderId
     * @return
     */
    OrderForm findByOrderId(Integer orderId);

}
