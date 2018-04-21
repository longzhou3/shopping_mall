package com.zhkj.entity;

/**
 * Created by lenovo on 2018/4/21.
 */
public class CommoditytyperelationEntity {
    private int id;
    private Integer shopPrimaryTypeId;
    private Integer shopMinorTypeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getShopPrimaryTypeId() {
        return shopPrimaryTypeId;
    }

    public void setShopPrimaryTypeId(Integer shopPrimaryTypeId) {
        this.shopPrimaryTypeId = shopPrimaryTypeId;
    }

    public Integer getShopMinorTypeId() {
        return shopMinorTypeId;
    }

    public void setShopMinorTypeId(Integer shopMinorTypeId) {
        this.shopMinorTypeId = shopMinorTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommoditytyperelationEntity that = (CommoditytyperelationEntity) o;

        if (id != that.id) return false;
        if (shopPrimaryTypeId != null ? !shopPrimaryTypeId.equals(that.shopPrimaryTypeId) : that.shopPrimaryTypeId != null)
            return false;
        if (shopMinorTypeId != null ? !shopMinorTypeId.equals(that.shopMinorTypeId) : that.shopMinorTypeId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (shopPrimaryTypeId != null ? shopPrimaryTypeId.hashCode() : 0);
        result = 31 * result + (shopMinorTypeId != null ? shopMinorTypeId.hashCode() : 0);
        return result;
    }
}
