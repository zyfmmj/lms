package com.peppa.yec.demo.mapper;

import java.util.List;
import com.peppa.yec.demo.pojo.Office;
import org.apache.ibatis.annotations.Param;

/**
 * @author zyf
 */
public interface OfficeMapper {

    /**
     * 根据 id 查询分理站信息
     * @param id
     * @return
     */
    Office findByPrimaryKey(Integer id);


    /**
     * 根据城市查询分理站
     * @param city
     * @return
     */
    List<Office> findByCity(@Param("city") String city);

    /**
     * 根据分理处名寻找id
     * @param name
     * @return
     */
    Integer findIdByName(String name);

}
