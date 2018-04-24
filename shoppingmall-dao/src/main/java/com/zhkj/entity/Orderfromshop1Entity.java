package com.zhkj.entity;

import java.math.BigDecimal;

/**
 * Created by lenovo on 2018/4/21.
 */
public class Orderfromshop1Entity {
    private Integer id;
    private int feight;
    private int commodityPrice;
    private Integer commodityNumber;
    private Integer logisticsTypeId;
    private Integer commodityId;
    private String orderFromId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getFeight() {
        return feight;
    }

    public void setFeight(int feight) {
        this.feight = feight;
    }

    public int getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(int commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public Integer getCommodityNumber() {
        return commodityNumber;
    }

    public void setCommodityNumber(Integer commodityNumber) {
        this.commodityNumber = commodityNumber;
    }

    public Integer getLogisticsTypeId() {
        return logisticsTypeId;
    }

    public void setLogisticsTypeId(Integer logisticsTypeId) {
        this.logisticsTypeId = logisticsTypeId;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getOrderFromId() {
        return orderFromId;
    }

    public void setOrderFromId(String orderFromId) {
        this.orderFromId = orderFromId;
    }
}
