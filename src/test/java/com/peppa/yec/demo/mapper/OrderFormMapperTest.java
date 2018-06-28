package com.peppa.yec.demo.mapper;

import com.peppa.yec.demo.pojo.OrderForm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class OrderFormMapperTest {
    @Autowired
    OrderFormMapper orderFormMapper;

    @Test
    public void findByOrderId() {
        OrderForm orderForm = orderFormMapper.findByOrderId(100086);
        System.out.println(orderForm.toString());
    }
}