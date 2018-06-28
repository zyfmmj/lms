package com.peppa.yec.demo.mapper;

import com.peppa.yec.demo.pojo.LoadCargo;

/**
 * @author zyf
 * 2018.06.23
 * 货物配载接口
 */
public interface LoadCargoMapper {
    /**
     * 根据主键删除货物配载录
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增货物配载记录
     * @param record
     * @return
     */
    int insert(LoadCargo record);


    /**
     * 根据主键字段修改记录
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(LoadCargo record);

    /**
     * 修改记录
     * @param record
     * @return
     */
    int updateByPrimaryKey(LoadCargo record);



    /**
     * 根据置空判断新增货物配载记录
     * @param record
     * @return
     */
    int insertSelective(LoadCargo record);


    /**
     * 查找invoice_no是否存在
     * @param invoiceNo
     * @return
     */
    Integer selectExistsInvoiceNo(Integer invoiceNo);

    /**
     * 根据 invoice_no 字段查找记录
     * @param invoiceNo
     * @return
     */
    LoadCargo selectByInvoiceNo(Integer invoiceNo);


}