package com.zhkj.entity;

/**
 * 商品表实体类
 */
public class CommodityEntity {
    private int id;
    private String commodityName;
    private Integer commodityPrice;
    private String commodityIntroduce;
    private String commodityPictureUrl;
    private Integer commodityNumber;
    private Integer commodityTypeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Integer getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Integer commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public String getCommodityIntroduce() {
        return commodityIntroduce;
    }

    public void setCommodityIntroduce(String commodityIntroduce) {
        this.commodityIntroduce = commodityIntroduce;
    }

    public String getCommodityPictureUrl() {
        return commodityPictureUrl;
    }

    public void setCommodityPictureUrl(String commodityPictureUrl) {
        this.commodityPictureUrl = commodityPictureUrl;
    }

    public Integer getCommodityNumber() {
        return commodityNumber;
    }

    public void setCommodityNumber(Integer commodityNumber) {
        this.commodityNumber = commodityNumber;
    }

    public Integer getCommodityTypeId() {
        return commodityTypeId;
    }

    public void setCommodityTypeId(Integer commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
    }

}
