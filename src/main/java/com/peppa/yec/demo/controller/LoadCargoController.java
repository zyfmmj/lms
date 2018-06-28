package com.peppa.yec.demo.controller;

import com.alibaba.fastjson.JSON;
import com.peppa.yec.demo.pojo.LoadCargo;
import com.peppa.yec.demo.pojo.SendBill;
import com.peppa.yec.demo.service.LoadCargoService;
import com.peppa.yec.demo.service.SendBillService;
import com.peppa.yec.demo.util.Cargo;
import com.peppa.yec.demo.util.CargoPage;
import com.peppa.yec.demo.util.Common;
import com.peppa.yec.demo.util.ListPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;


/**
 * @author zyf
 */
@Controller
public class LoadCargoController {

    @Autowired
    LoadCargoService loadCargoService;

    @Autowired
    SendBillService sendBillService;

    @RequestMapping("load")
    public String loadIndex(){
        return "/newCargo";
    }

    @RequestMapping("searchCargo")
    @ResponseBody
    public String search(
            Integer invoiceNo
    ){
        Cargo cargo = loadCargoService.findCargoPage(invoiceNo);
        return JSON.toJSONString(cargo);
    }

    @RequestMapping("addCargo")
    public String addCargo(
            LoadCargo loadCargo
    ){
        if(loadCargoService.addLoadCargo(loadCargo)){
            return "redirect:/load";
        }else {
            return "/error";
        }
    }

    @RequestMapping("/cargoList")
    public String cargo(
            Integer pageNo,
            Model model){
        ListPage page = sendBillService.findAll(1,pageNo,Common.PAGE_SIZE);
        model.addAttribute("page",page);
        return "/cargoList";
    }

    @RequestMapping(value = "cargoConfirm", method = RequestMethod.POST)
    @ResponseBody
    public String  cargoConfirm(Integer invoiceNo){
        if(loadCargoService.cargoConfirm(invoiceNo)){
            return "ok";
        }else{
            return "err";
        }
    }
}
