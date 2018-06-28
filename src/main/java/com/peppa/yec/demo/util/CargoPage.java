package com.peppa.yec.demo.util;

import com.peppa.yec.demo.pojo.LoadCargo;
import com.peppa.yec.demo.pojo.SendBill;

/**
 * @author zyf
 */
public class CargoPage {
    private SendBill sendBill;
    private LoadCargo loadCargo;

    public SendBill getSendBill() {
        return sendBill;
    }

    public void setSendBill(SendBill sendBill) {
        this.sendBill = sendBill;
    }

    public LoadCargo getLoadCargo() {
        return loadCargo;
    }

    public void setLoadCargo(LoadCargo loadCargo) {
        this.loadCargo = loadCargo;
    }

    @Override
    public String toString() {
        return "CargoPage{" +
                "sendBill=" + sendBill +
                ", loadCargo=" + loadCargo +
                '}';
    }
}
