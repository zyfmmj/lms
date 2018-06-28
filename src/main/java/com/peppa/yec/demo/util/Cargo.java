package com.peppa.yec.demo.util;

import com.peppa.yec.demo.pojo.Car;
import com.peppa.yec.demo.pojo.SendBill;
import java.util.List;

/**
 * @author zyf
 */
public class Cargo {
    private SendBill sendBill;
    private List<Car> cars;

    public SendBill getSendBill() {
        return sendBill;
    }

    public void setSendBill(SendBill sendBill) {
        this.sendBill = sendBill;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "sendBill=" + sendBill +
                ", cars=" + cars +
                '}';
    }
}
