package com.peppa.yec.demo.service.imp;

import com.alibaba.fastjson.JSONArray;
import com.peppa.yec.demo.mapper.LoadCargoMapper;
import com.peppa.yec.demo.mapper.SendBillMapper;
import com.peppa.yec.demo.pojo.LoadCargo;
import com.peppa.yec.demo.pojo.SendBill;
import com.peppa.yec.demo.service.CarService;
import com.peppa.yec.demo.service.LoadCargoService;
import com.peppa.yec.demo.service.OfficeService;
import com.peppa.yec.demo.service.SendBillService;
import com.peppa.yec.demo.util.Cargo;
import com.peppa.yec.demo.util.CargoPage;
import com.peppa.yec.demo.util.ListPage;
import com.peppa.yec.demo.util.RandomNum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author zyf
 * 2018.06.23
 */
@Service
public class LoadCargoServiceImp implements LoadCargoService {

    @Autowired
    LoadCargoMapper loadCargoMapper;

    @Autowired
    SendBillMapper sendBillMapper;

    @Autowired
    CarService carService;

    @Override
    public Boolean addLoadCargo(LoadCargo loadCargo) {
        loadCargo.setLoadDate(new Date());
        if(loadCargoMapper.insertSelective(loadCargo) != 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public CargoPage findCargoInfo(Integer invoiceNo) {
        CargoPage cargoPage = new CargoPage();
        LoadCargo loadCargo = loadCargoMapper.selectByInvoiceNo(invoiceNo);
        SendBill sendBill = sendBillMapper.selectByPrimaryKey(loadCargo.getSendId());
        cargoPage.setLoadCargo(loadCargo);
        cargoPage.setSendBill(sendBill);

        return cargoPage;
    }

    @Override
    public Cargo findCargoPage(Integer waybillNo) {
        Cargo cargo = new Cargo();
        SendBill sendBill = sendBillMapper.selectByWaybillNo(waybillNo);
        cargo.setSendBill(sendBill);
        cargo.setCars(carService.findByState(sendBill.getOfficeName()));
        return cargo;
    }

    @Override
    public Boolean cargoConfirm(Integer waybillNo) {
        if(sendBillMapper.updateState(waybillNo,3)!=0){
            return true;
        }else {
            return false;
        }
    }

}
