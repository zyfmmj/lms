package com.peppa.yec.demo.service.imp;

import com.peppa.yec.demo.pojo.SendBill;
import com.peppa.yec.demo.service.SendBillService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SendBillServiceImpTest {
    @Autowired
    SendBillService sendBillService;

    @Test
    public void addSendBill() {
        SendBill sendBill = new SendBill();
        sendBill.setWaybillNo(120095451);
        sendBill.setGive("赵二");
        sendBill.setCargoNum(1);
        sendBillService.updateSendBill(sendBill);
    }

    @Test
    public void findAll() {
    }
}