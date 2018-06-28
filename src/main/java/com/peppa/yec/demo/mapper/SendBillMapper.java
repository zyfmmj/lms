package com.peppa.yec.demo.mapper;

import com.peppa.yec.demo.pojo.SendBill;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * @author zyf
 * 2018.06.23
 * 运输单表实体类
 */
public interface SendBillMapper {
    /**
     * 根据主键删除记录
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);


    /**
     * 新增记录
     * @param record
     * @return
     */
    int insert(SendBill record);

    /**
     * 修改记录
     * @param record
     * @return
     */
    int updateByPrimaryKey(SendBill record);

    /**
     * 判断置空插入记录
     * @param record
     * @return
     */
    int insertSelective(SendBill record);

    /**
     * 查找是否有相同运单号
     * @param waybillNo
     * @return
     */
    int selectExistsWaybillNo(Integer waybillNo);

    /**
     * 根据运单号查找记录
     * @param waybillNo
     * @return
     */
    SendBill selectByWaybillNo(Integer waybillNo);

    /**
     * 判断为空并修改记录
     * @param record
     * @return
     */
    int updateByWaybillNoSelective(SendBill record);

    /**
     * 根据主键查找记录
     * @param id
     * @return
     */
    SendBill selectByPrimaryKey(Integer id);


    /**
     * 根据state查找sendBill集合
     * @param state
     * @return
     */
    List<SendBill> selectByState(@Param("state") Integer state, @Param("offset")Integer offset, @Param("pageSize")Integer pageSize);

    /**
     * 根据state查找记录数量
     * @param state
     * @return
     */
    Integer selectCountByState(@Param("state") Integer state);


    /**
     * 修改货物状态
     * @param waybillNo
     * @param state
     * @return
     */
    Integer updateState(@Param("waybillNo") Integer waybillNo, @Param("state") Integer state);


}