package com.peppa.yec.demo.service;

import com.peppa.yec.demo.pojo.Path;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class PathServiceTest {

    @Autowired
    PathService pathService;

    @Test
    public void findByPath() {

        Path path = pathService.findByPath("江苏淮安","江苏南京");

    }

    @Test
    public void findByOfficeId() {
    }
}