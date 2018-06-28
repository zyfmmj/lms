package com.peppa.yec.demo.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * load_cargo
 * @author zyf
 */
public class LoadCargo implements Serializable {
    private Integer id;
    /**
     * 运单Id
     */
    private Integer sendId;
    /**
     * 货单号
     */
    private Integer invoiceNo;
    /**
     * 目前地点
     */
    private String site;
    /**
     * 装车日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date loadDate;
    /**
     * 车辆Id
     */
    private Integer carId;
    /**
     * 货物状态
     */
    private Integer cargoState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSendId() {
        return sendId;
    }

    public void setSendId(Integer sendId) {
        this.sendId = sendId;
    }

    public Integer getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Integer invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Date getLoadDate() {
        return loadDate;
    }

    public void setLoadDate(Date loadDate) {
        this.loadDate = loadDate;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getCargoState() {
        return cargoState;
    }

    public void setCargoState(Integer cargoState) {
        this.cargoState = cargoState;
    }
}