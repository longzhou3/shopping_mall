package com.zhkj.entity;

import java.sql.Timestamp;

/**
 *售后处理实体类
 */
public class CustomerserviceEntity {
    private int id;
    private String causeOfReturn;
    private Integer demandTime;
    private Timestamp acceptanceTime;
    private Timestamp commitTime;
    private Integer orderId;
    private Integer userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCauseOfReturn() {
        return causeOfReturn;
    }

    public void setCauseOfReturn(String causeOfReturn) {
        this.causeOfReturn = causeOfReturn;
    }

    public Integer getDemandTime() {
        return demandTime;
    }

    public void setDemandTime(Integer demandTime) {
        this.demandTime = demandTime;
    }

    public Timestamp getAcceptanceTime() {
        return acceptanceTime;
    }

    public void setAcceptanceTime(Timestamp acceptanceTime) {
        this.acceptanceTime = acceptanceTime;
    }

    public Timestamp getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(Timestamp commitTime) {
        this.commitTime = commitTime;
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
