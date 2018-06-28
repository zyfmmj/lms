package com.peppa.yec.demo.mapper;

import com.peppa.yec.demo.pojo.Path;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zyf
 */
public interface PathMapper {

    /**
     * 根据路线查找路线详细信息
     * @param order
     * @param terminus
     * @return
     */
    Path findByPath(@Param("order") String order, @Param("terminus") String terminus);


    /**
     * 根据分理处查找路线
     * @param officeId
     * @return
     */
    List<Path> findByOfficeId(Integer officeId);
}
