package com.peppa.yec.demo.service.imp;

import com.peppa.yec.demo.pojo.LoadCargo;
import com.peppa.yec.demo.service.LoadCargoService;
import com.peppa.yec.demo.util.Cargo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class LoadCargoServiceImpTest {
    @Autowired
    LoadCargoService service;

    @Test
    public void addLoadCargo() {
        LoadCargo loadCargo = new LoadCargo();
        loadCargo.setSendId(1);
        service.addLoadCargo(loadCargo);
    }

    @Test
    public void findCargoPage() {
        Cargo cargo = service.findCargoPage(120095451);
        System.out.println(cargo.toString());
    }
}