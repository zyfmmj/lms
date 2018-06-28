package com.peppa.yec.demo.service;

import com.peppa.yec.demo.pojo.Car;
import java.util.List;

/**
 * @author zyf
 */
public interface CarService {

    /**
     * 根据分理处查询所有车辆
     * @param officeId
     * @return
     */
    List<Car> findAll(Integer officeId);

    /**
     * 查询所有未装车车辆
     * @param officeName
     * @return
     */
    List<Car> findByState(String officeName);

}
