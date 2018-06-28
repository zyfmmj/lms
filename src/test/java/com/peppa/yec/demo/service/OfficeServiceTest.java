package com.peppa.yec.demo.service;

import com.peppa.yec.demo.pojo.Office;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class OfficeServiceTest {

    @Autowired
    OfficeService officeService;

    @Test
    public void findAll() {
    }

    @Test
    public void findByPrimaryKey() {
        Office office = officeService.findByPrimaryKey(1);
        System.out.println(office.toString());
    }
}