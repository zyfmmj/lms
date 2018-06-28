package com.peppa.yec.demo.mapper;

import com.peppa.yec.demo.pojo.Car;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zyf
 */
public interface CarMapper {


    /**
     * 根据分理处查询未装货车辆
     * @param officeId
     * @return
     */
    List<Car> findByOfficeId(
            @Param("officeId") Integer officeId
    );

}
