package com.peppa.yec.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.peppa.yec.demo.pojo.Office;
import com.peppa.yec.demo.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zyf
 */
@Controller
public class OfficeController {

    @Autowired
    OfficeService officeService;

    @RequestMapping("/searchOffice")
    @ResponseBody
    public JSONArray searchOffice(
            String city
    ){
        JSONArray jsonArray = officeService.findByCity(city);
        return jsonArray;
    }

}
