package com.peppa.yec.demo.service;

import com.peppa.yec.demo.pojo.LoadCargo;
import com.peppa.yec.demo.pojo.SendBill;
import com.peppa.yec.demo.util.Cargo;
import com.peppa.yec.demo.util.CargoPage;
import java.util.List;

/**
 * @author zyf
 * 2018.06.23
 */
public interface LoadCargoService {

    /**
     * 增加货物单
     * @param loadCargo
     * @return
     */
    Boolean addLoadCargo(LoadCargo loadCargo);

    /**
     * 查找货物配载信息
     * @param invoiceNo
     * @return
     */
    CargoPage findCargoInfo(Integer invoiceNo);

    /**
     * 根据运单号查找运单信息
     * @param waybillNo
     * @return
     */
    Cargo findCargoPage(Integer waybillNo);

    /**
     * 确认收货
     * @param waybillNo
     * @return
     */
    public Boolean cargoConfirm(Integer waybillNo);

}
