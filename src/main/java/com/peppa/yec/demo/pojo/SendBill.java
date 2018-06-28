package com.peppa.yec.demo.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * send_bill
 * @author 
 */
public class SendBill implements Serializable {
    private Integer id;

    /**
     * 运单号
     */
    private Integer waybillNo;

    /**
     * 出发站
     */
    private String origin;

    /**
     * 到达站
     */
    private String terminus;

    /**
     * 发货日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date sendDate;

    /**
     * 发货人
     */
    private String give;

    /**
     * 发货人地址
     */
    private String giveAddr;

    /**
     * 发货人电话
     */
    private String givePhone;

    /**
     * 收货人
     */
    private String take;

    /**
     * 收货人地址
     */
    private String takeAddr;

    /**
     * 收货人电话
     */
    private String takePhone;

    /**
     * 货物名称
     */
    private String cargoName;

    /**
     * 件数
     */
    private Integer cargoNum;

    /**
     * 包装类型
     */
    private String packWay;

    /**
     * 重量
     */
    private BigDecimal cargoWeight;

    /**
     * 体积
     */
    private BigDecimal cargoBulk;

    /**
     * 运费
     */
    private BigDecimal shipCost;

    /**
     * 服务费
     */
    private BigDecimal serviceCost;

    /**
     * 保险额度
     */
    private BigDecimal insurance;

    /**
     * 保险费
     */
    private BigDecimal premium;

    /**
     * 货物补充说明
     */
    private String cargoComment;

    /**
     * 结算方式
     */
    private String clearingForm;

    /**
     * 备注
     */
    private String comment;

    /**
     * 承运分部
     */
    private String officeName;

    private Integer state;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWaybillNo() {
        return waybillNo;
    }

    public void setWaybillNo(Integer waybillNo) {
        this.waybillNo = waybillNo;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTerminus() {
        return terminus;
    }

    public void setTerminus(String terminus) {
        this.terminus = terminus;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
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

    public String getCargoName() {
        return cargoName;
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }

    public Integer getCargoNum() {
        return cargoNum;
    }

    public void setCargoNum(Integer cargoNum) {
        this.cargoNum = cargoNum;
    }

    public String getPackWay() {
        return packWay;
    }

    public void setPackWay(String packWay) {
        this.packWay = packWay;
    }

    public BigDecimal getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(BigDecimal cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public BigDecimal getCargoBulk() {
        return cargoBulk;
    }

    public void setCargoBulk(BigDecimal cargoBulk) {
        this.cargoBulk = cargoBulk;
    }

    public BigDecimal getShipCost() {
        return shipCost;
    }

    public void setShipCost(BigDecimal shipCost) {
        this.shipCost = shipCost;
    }

    public BigDecimal getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(BigDecimal serviceCost) {
        this.serviceCost = serviceCost;
    }

    public BigDecimal getInsurance() {
        return insurance;
    }

    public void setInsurance(BigDecimal insurance) {
        this.insurance = insurance;
    }

    public BigDecimal getPremium() {
        return premium;
    }

    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    public String getCargoComment() {
        return cargoComment;
    }

    public void setCargoComment(String cargoComment) {
        this.cargoComment = cargoComment;
    }

    public String getClearingForm() {
        return clearingForm;
    }

    public void setClearingForm(String clearingForm) {
        this.clearingForm = clearingForm;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SendBill other = (SendBill) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWaybillNo() == null ? other.getWaybillNo() == null : this.getWaybillNo().equals(other.getWaybillNo()))
            && (this.getOrigin() == null ? other.getOrigin() == null : this.getOrigin().equals(other.getOrigin()))
            && (this.getTerminus() == null ? other.getTerminus() == null : this.getTerminus().equals(other.getTerminus()))
            && (this.getSendDate() == null ? other.getSendDate() == null : this.getSendDate().equals(other.getSendDate()))
            && (this.getGive() == null ? other.getGive() == null : this.getGive().equals(other.getGive()))
            && (this.getGiveAddr() == null ? other.getGiveAddr() == null : this.getGiveAddr().equals(other.getGiveAddr()))
            && (this.getGivePhone() == null ? other.getGivePhone() == null : this.getGivePhone().equals(other.getGivePhone()))
            && (this.getTake() == null ? other.getTake() == null : this.getTake().equals(other.getTake()))
            && (this.getTakeAddr() == null ? other.getTakeAddr() == null : this.getTakeAddr().equals(other.getTakeAddr()))
            && (this.getTakePhone() == null ? other.getTakePhone() == null : this.getTakePhone().equals(other.getTakePhone()))
            && (this.getCargoName() == null ? other.getCargoName() == null : this.getCargoName().equals(other.getCargoName()))
            && (this.getCargoNum() == null ? other.getCargoNum() == null : this.getCargoNum().equals(other.getCargoNum()))
            && (this.getPackWay() == null ? other.getPackWay() == null : this.getPackWay().equals(other.getPackWay()))
            && (this.getCargoWeight() == null ? other.getCargoWeight() == null : this.getCargoWeight().equals(other.getCargoWeight()))
            && (this.getCargoBulk() == null ? other.getCargoBulk() == null : this.getCargoBulk().equals(other.getCargoBulk()))
            && (this.getShipCost() == null ? other.getShipCost() == null : this.getShipCost().equals(other.getShipCost()))
            && (this.getServiceCost() == null ? other.getServiceCost() == null : this.getServiceCost().equals(other.getServiceCost()))
            && (this.getInsurance() == null ? other.getInsurance() == null : this.getInsurance().equals(other.getInsurance()))
            && (this.getPremium() == null ? other.getPremium() == null : this.getPremium().equals(other.getPremium()))
            && (this.getCargoComment() == null ? other.getCargoComment() == null : this.getCargoComment().equals(other.getCargoComment()))
            && (this.getClearingForm() == null ? other.getClearingForm() == null : this.getClearingForm().equals(other.getClearingForm()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getOfficeName() == null ? other.getOfficeName() == null : this.getOfficeName().equals(other.getOfficeName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWaybillNo() == null) ? 0 : getWaybillNo().hashCode());
        result = prime * result + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        result = prime * result + ((getTerminus() == null) ? 0 : getTerminus().hashCode());
        result = prime * result + ((getSendDate() == null) ? 0 : getSendDate().hashCode());
        result = prime * result + ((getGive() == null) ? 0 : getGive().hashCode());
        result = prime * result + ((getGiveAddr() == null) ? 0 : getGiveAddr().hashCode());
        result = prime * result + ((getGivePhone() == null) ? 0 : getGivePhone().hashCode());
        result = prime * result + ((getTake() == null) ? 0 : getTake().hashCode());
        result = prime * result + ((getTakeAddr() == null) ? 0 : getTakeAddr().hashCode());
        result = prime * result + ((getTakePhone() == null) ? 0 : getTakePhone().hashCode());
        result = prime * result + ((getCargoName() == null) ? 0 : getCargoName().hashCode());
        result = prime * result + ((getCargoNum() == null) ? 0 : getCargoNum().hashCode());
        result = prime * result + ((getPackWay() == null) ? 0 : getPackWay().hashCode());
        result = prime * result + ((getCargoWeight() == null) ? 0 : getCargoWeight().hashCode());
        result = prime * result + ((getCargoBulk() == null) ? 0 : getCargoBulk().hashCode());
        result = prime * result + ((getShipCost() == null) ? 0 : getShipCost().hashCode());
        result = prime * result + ((getServiceCost() == null) ? 0 : getServiceCost().hashCode());
        result = prime * result + ((getInsurance() == null) ? 0 : getInsurance().hashCode());
        result = prime * result + ((getPremium() == null) ? 0 : getPremium().hashCode());
        result = prime * result + ((getCargoComment() == null) ? 0 : getCargoComment().hashCode());
        result = prime * result + ((getClearingForm() == null) ? 0 : getClearingForm().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getOfficeName() == null) ? 0 : getOfficeName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", waybillNo=").append(waybillNo);
        sb.append(", origin=").append(origin);
        sb.append(", terminus=").append(terminus);
        sb.append(", sendDate=").append(sendDate);
        sb.append(", give=").append(give);
        sb.append(", giveAddr=").append(giveAddr);
        sb.append(", givePhone=").append(givePhone);
        sb.append(", take=").append(take);
        sb.append(", takeAddr=").append(takeAddr);
        sb.append(", takePhone=").append(takePhone);
        sb.append(", cargoName=").append(cargoName);
        sb.append(", cargoNum=").append(cargoNum);
        sb.append(", packWay=").append(packWay);
        sb.append(", cargoWeight=").append(cargoWeight);
        sb.append(", cargoBulk=").append(cargoBulk);
        sb.append(", shipCost=").append(shipCost);
        sb.append(", serviceCost=").append(serviceCost);
        sb.append(", insurance=").append(insurance);
        sb.append(", premium=").append(premium);
        sb.append(", cargoComment=").append(cargoComment);
        sb.append(", clearingForm=").append(clearingForm);
        sb.append(", comment=").append(comment);
        sb.append(", officeName=").append(officeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}