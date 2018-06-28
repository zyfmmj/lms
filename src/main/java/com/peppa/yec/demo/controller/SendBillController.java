package com.peppa.yec.demo.controller;

import com.peppa.yec.demo.pojo.Path;
import com.peppa.yec.demo.pojo.SendBill;
import com.peppa.yec.demo.service.SendBillService;
import com.peppa.yec.demo.util.Common;
import com.peppa.yec.demo.util.ListPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zyf
 */
@Controller
public class SendBillController {

    @Autowired
    SendBillService sendBillService;

    @RequestMapping("newSendBill")
    public String newSendBill(){
        return "/newSendBill";
    }

    @RequestMapping(value = "newSendBill", method = RequestMethod.POST)
    public String newSendBill(
            SendBill sendBill,
            Model model
    ){
        Integer result = sendBillService.addSendBill(sendBill);
        if(result!=0){
            model.addAttribute("result",result);
        }else{
            model.addAttribute("result",0);
        }

        return "/newOk";
    }

    @RequestMapping("calc")
    @ResponseBody
    public String calc(
            String origin,
            String terminus,
            Integer cargoNum,
            Double cargoWeight,
            Double cargoBulk
    ){
        Path path = sendBillService.findByOrigin(origin, terminus);
        Double cost = sendBillService.calcCost(path, cargoNum, cargoWeight, cargoBulk);
        return cost+"";
    }

    @RequestMapping("list")
    public String list(
            Integer state,
            Integer pageNo,
            Model model
    ){
        ListPage page = sendBillService.findAll(state,pageNo,Common.PAGE_SIZE);
        model.addAttribute("page",page);
        return "/sendBillList";
    }

    /**
     * 根据id查找票据记录
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("searchBill")
    public String searchBill(Integer id,Model model){
        SendBill sendBill = sendBillService.findSendBillById(id);
        model.addAttribute("sendBill",sendBill);
        return "/updateSendBill";
    }

    @RequestMapping("update")
    public String update(SendBill sendBill){
        Boolean result = sendBillService.updateSendBill(sendBill);
        if(result) {
            return "/updateOk";
        }else{
            return "/error";
        }
    }

}
