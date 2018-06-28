package com.peppa.yec.demo.service.imp;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.peppa.yec.demo.mapper.OfficeMapper;
import com.peppa.yec.demo.pojo.Office;
import com.peppa.yec.demo.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author zyf
 */
@Service
public class OfficeServiceImp implements OfficeService {
    @Autowired
    OfficeMapper officeMapper;

    @Override
    public Office findByPrimaryKey(Integer id) {
        return officeMapper.findByPrimaryKey(id);
    }

    @Override
    public JSONArray findByCity(String city) {
        JSONArray json = new JSONArray();

        List<Office> offices = officeMapper.findByCity(city);
        for (Office office:offices) {
            JSONObject jo = new JSONObject();
            jo.put("id",office.getId());
            jo.put("name",office.getName());
            jo.put("city",office.getCity());
            json.add(jo);
        }
        return json;
    }

    @Override
    public Integer findIdByName(String name) {
        return officeMapper.findIdByName(name);
    }
}
