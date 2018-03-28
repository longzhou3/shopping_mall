package com.zhkj.entity;

/**
 * 折扣表实体类
 */
public class DiscountEntity {
    private int id;
    private Integer discountPrice;
    private String discountIntroduce;
    private Integer discountTypeId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Integer discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getDiscountIntroduce() {
        return discountIntroduce;
    }

    public void setDiscountIntroduce(String discountIntroduce) {
        this.discountIntroduce = discountIntroduce;
    }

    public Integer getDiscountTypeId() {
        return discountTypeId;
    }

    public void setDiscountTypeId(Integer discountTypeId) {
        this.discountTypeId = discountTypeId;
    }


}
