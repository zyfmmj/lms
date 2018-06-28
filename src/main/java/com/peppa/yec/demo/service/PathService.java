package com.peppa.yec.demo.service;

import com.peppa.yec.demo.pojo.Path;

import java.util.List;

/**
 * @author zyf
 */
public interface PathService {

    /**
     * 根据路线查找路线详细信息
     * @param order
     * @param terminus
     * @return
     */
    Path findByPath(String order, String terminus);


    /**
     * 根据分理处查找路线
     * @param officeId
     * @return
     */
    List<Path> findByOfficeId(Integer officeId);

}
