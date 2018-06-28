package com.peppa.yec.demo.service.imp;

import com.peppa.yec.demo.pojo.Car;
import com.peppa.yec.demo.service.CarService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CarServiceImpTest {

    @Autowired
    CarService carService;

    @Test
    public void findAll() {
    }

    @Test
    public void findByState() {
        List<Car> cars = carService.findByState("淮安分理处");
        for (Car c:cars) {
            System.out.println(c.toString());
        }
    }
}