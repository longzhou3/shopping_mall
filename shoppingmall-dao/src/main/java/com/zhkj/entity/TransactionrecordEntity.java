package com.zhkj.entity;

import java.sql.Timestamp;

/**
 * 交易记录表实体类
 */
public class TransactionrecordEntity {
    private int id;
    private Timestamp creationTime;
    private Integer logistisTypeId;
    private Integer orderId;
    private Integer userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Timestamp creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getLogistisTypeId() {
        return logistisTypeId;
    }

    public void setLogistisTypeId(Integer logistisTypeId) {
        this.logistisTypeId = logistisTypeId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


}
