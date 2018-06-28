package com.peppa.yec.demo.service;

import com.alibaba.fastjson.JSONArray;
import com.peppa.yec.demo.mapper.OfficeMapper;
import com.peppa.yec.demo.pojo.Office;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zyf
 */
public interface OfficeService {

    /**
     * 根据id查询office记录
     * @param id
     * @return
     */
    Office findByPrimaryKey(Integer id);


    /**
     * 根据城市查询分理站
     * @param city
     * @return
     */
    JSONArray findByCity(String city);

    /**
     * 根据分理处名寻找id
     * @param name
     * @return
     */
    Integer findIdByName(String name);


}
