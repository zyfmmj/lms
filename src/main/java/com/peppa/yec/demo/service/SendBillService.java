package com.peppa.yec.demo.service;

import com.peppa.yec.demo.pojo.Path;
import com.peppa.yec.demo.pojo.SendBill;
import com.peppa.yec.demo.util.ListPage;

import java.util.List;

/**
 * @author zyf
 * 2018.06.23
 */
public interface SendBillService {

    /**
     * 添加运输单
     * @param sendBill
     * @return
     */
    Integer addSendBill(SendBill sendBill);

    /**
     * 根据运单号查找
     * @param waybillNo
     * @return
     */
    SendBill findSendBillByWaybillNo(Integer waybillNo);

    /**
     * 修改记录
     * @param sendBill
     * @return
     */
    Boolean updateSendBill(SendBill sendBill);


    /**
     * 根据运单号查找
     * @param id
     * @return
     */
    SendBill findSendBillById(Integer id);


    /**
     * 计算运费
     * @param path
     * @param num
     * @param weight
     * @param bulk
     * @return
     */
    Double calcCost(Path path,Integer num , Double weight, Double bulk);

    /**
     * 选择路线
     * @param origin
     * @param findByOrigin
     * @return
     */
    Path findByOrigin(String origin, String findByOrigin);


    /**
     * 查询票据列表
     * @param state
     * @param pageNo
     * @param pageSize
     * @return
     */
    ListPage findAll(Integer state, Integer pageNo, Integer pageSize);

    /**
     * 修改货物状态
     * @param waybillNo
     * @param state
     * @return
     */
    Boolean updateState(Integer waybillNo, Integer state);
}
