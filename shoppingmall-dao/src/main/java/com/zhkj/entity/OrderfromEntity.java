package com.zhkj.entity;

import java.sql.Timestamp;

/**
 * 订单表实体类
 */
public class OrderfromEntity {
    private int id;
    private String orderNumber;
    private Timestamp orderCreationTime;
    private Integer userId;
    private Integer orderTypeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Timestamp getOrderCreationTime() {
        return orderCreationTime;
    }

    public void setOrderCreationTime(Timestamp orderCreationTime) {
        this.orderCreationTime = orderCreationTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(Integer orderTypeId) {
        this.orderTypeId = orderTypeId;
    }


}
