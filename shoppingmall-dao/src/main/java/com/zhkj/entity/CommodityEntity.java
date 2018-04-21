package com.zhkj.entity;

/**
 * Created by lenovo on 2018/4/21.
 */
public class CommodityEntity {
    private int id;
    private String commodityName;
    private String commodityIntroduce;
    private String bigPictureUrl;
    private Integer commodityTypeRelationId;

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

    public String getCommodityIntroduce() {
        return commodityIntroduce;
    }

    public void setCommodityIntroduce(String commodityIntroduce) {
        this.commodityIntroduce = commodityIntroduce;
    }

    public String getBigPictureUrl() {
        return bigPictureUrl;
    }

    public void setBigPictureUrl(String bigPictureUrl) {
        this.bigPictureUrl = bigPictureUrl;
    }

    public Integer getCommodityTypeRelationId() {
        return commodityTypeRelationId;
    }

    public void setCommodityTypeRelationId(Integer commodityTypeRelationId) {
        this.commodityTypeRelationId = commodityTypeRelationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommodityEntity that = (CommodityEntity) o;

        if (id != that.id) return false;
        if (commodityName != null ? !commodityName.equals(that.commodityName) : that.commodityName != null)
            return false;
        if (commodityIntroduce != null ? !commodityIntroduce.equals(that.commodityIntroduce) : that.commodityIntroduce != null)
            return false;
        if (bigPictureUrl != null ? !bigPictureUrl.equals(that.bigPictureUrl) : that.bigPictureUrl != null)
            return false;
        if (commodityTypeRelationId != null ? !commodityTypeRelationId.equals(that.commodityTypeRelationId) : that.commodityTypeRelationId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (commodityName != null ? commodityName.hashCode() : 0);
        result = 31 * result + (commodityIntroduce != null ? commodityIntroduce.hashCode() : 0);
        result = 31 * result + (bigPictureUrl != null ? bigPictureUrl.hashCode() : 0);
        result = 31 * result + (commodityTypeRelationId != null ? commodityTypeRelationId.hashCode() : 0);
        return result;
    }
}
