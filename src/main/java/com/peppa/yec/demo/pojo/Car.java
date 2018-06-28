package com.peppa.yec.demo.pojo;

/**
 * @author zyf
 */
public class Car {
    private Integer id;
    /**
     * 所属分理站
     */
    private Integer officeId;
    /**
     * 所属司机
     */
    private Integer driverId;
    /**
     * 车牌号
     */
    private String carId;
    /**
     * 车辆状态
     */
    private Integer carState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public Integer getCarState() {
        return carState;
    }

    public void setCarState(Integer carState) {
        this.carState = carState;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", officeId=" + officeId +
                ", driverId=" + driverId +
                ", carId='" + carId + '\'' +
                ", carState=" + carState +
                '}';
    }
}
