package com.peppa.yec.demo.pojo;

/**
 * @author zyf
 */
public class Path {
    private Integer id;
    private Integer officeId;
    private String order;
    private String terminus;
    private Double startingCost;
    private Double weightCost;
    private Double bulkCost;
    private String totalCost;

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

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getTerminus() {
        return terminus;
    }

    public void setTerminus(String terminus) {
        this.terminus = terminus;
    }

    public Double getStartingCost() {
        return startingCost;
    }

    public void setStartingCost(Double startingCost) {
        this.startingCost = startingCost;
    }

    public Double getWeightCost() {
        return weightCost;
    }

    public void setWeightCost(Double weightCost) {
        this.weightCost = weightCost;
    }

    public Double getBulkCost() {
        return bulkCost;
    }

    public void setBulkCost(Double bulkCost) {
        this.bulkCost = bulkCost;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Path{" +
                "id=" + id +
                ", officeId=" + officeId +
                ", order='" + order + '\'' +
                ", terminus='" + terminus + '\'' +
                ", startingCost='" + startingCost + '\'' +
                ", weightCost=" + weightCost +
                ", bulkCost=" + bulkCost +
                ", totalCost='" + totalCost + '\'' +
                '}';
    }
}
