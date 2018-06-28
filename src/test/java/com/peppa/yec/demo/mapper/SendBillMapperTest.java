package com.peppa.yec.demo.mapper;

import com.peppa.yec.demo.pojo.SendBill;
import com.peppa.yec.demo.util.RandomNum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SendBillMapperTest {

    @Autowired
    SendBillMapper sendBillMapper;

    @Test
    public void deleteByPrimaryKey() {
        sendBillMapper.selectByPrimaryKey(1);
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
        System.out.println(RandomNum.getNum());
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}