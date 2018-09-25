package entity;

import java.util.Date;

public class TableOrder {
    private Integer orderId;

    private Integer userId;

    private String dishIds;

    private Integer nums;

    private Double prices;

    private Double allPrice;

    private Date createTime;

    private String address;

    private String shopName;

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

    public String getDishIds() {
        return dishIds;
    }

    public void setDishIds(String dishIds) {
        this.dishIds = dishIds == null ? null : dishIds.trim();
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public Double getPrices() {
        return prices;
    }

    public void setPrices(Double prices) {
        this.prices = prices;
    }

    public Double getAllPrice() {
        return allPrice;
    }

    public void setAllPrice(Double allPrice) {
        this.allPrice = allPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }
}