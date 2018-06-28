package com.peppa.yec.demo.pojo;

/**
 * @author zyf
 */
public class OrderForm {
    private Integer id;
    private Integer orderId;
    private String give;
    private String giveAddr;
    private String givePhone;
    private String take;
    private String takeAddr;
    private String takePhone;
    private String cargoName;
    private Integer cargoNum;
    private Double cargoWeight;
    private Double cargoBulk;
    private String cargoComment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getGive() {
        return give;
    }

    public void setGive(String give) {
        this.give = give;
    }

    public String getGiveAddr() {
        return giveAddr;
    }

    public void setGiveAddr(String giveAddr) {
        this.giveAddr = giveAddr;
    }

    public String getGivePhone() {
        return givePhone;
    }

    public void setGivePhone(String givePhone) {
        this.givePhone = givePhone;
    }

    public String getTake() {
        return take;
    }

    public void setTake(String take) {
        this.take = take;
    }

    public String getTakeAddr() {
        return takeAddr;
    }

    public void setTakeAddr(String takeAddr) {
        this.takeAddr = takeAddr;
    }

    public String getTakePhone() {
        return takePhone;
    }

    public void setTakePhone(String takePhone) {
        this.takePhone = takePhone;
    }

    public Integer getCargoNum() {
        return cargoNum;
    }

    public void setCargoNum(Integer cargoNum) {
        this.cargoNum = cargoNum;
    }

    public String getCargoName() {
        return cargoName;
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }

    public Double getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(Double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public Double getCargoBulk() {
        return cargoBulk;
    }

    public void setCargoBulk(Double cargoBulk) {
        this.cargoBulk = cargoBulk;
    }

    public String getCargoComment() {
        return cargoComment;
    }

    public void setCargoComment(String cargoComment) {
        this.cargoComment = cargoComment;
    }

    @Override
    public String toString() {
        return "OrderForm{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", give='" + give + '\'' +
                ", giveAddr='" + giveAddr + '\'' +
                ", givePhone='" + givePhone + '\'' +
                ", take='" + take + '\'' +
                ", takeAddr='" + takeAddr + '\'' +
                ", takePhone='" + takePhone + '\'' +
                ", cargoName='" + cargoName + '\'' +
                ", cargoWeight=" + cargoWeight +
                ", cargoBulk=" + cargoBulk +
                ", cargoComment='" + cargoComment + '\'' +
                '}';
    }
}
