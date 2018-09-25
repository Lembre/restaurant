package entity;

public class Dish {
    private String dishId;

    private String dishName;

    private Double dishPrice;

    public String getDishId() {
        return dishId;
    }

    public void setDishId(String dishId) {
        this.dishId = dishId == null ? null : dishId.trim();
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName == null ? null : dishName.trim();
    }

    public Double getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(Double dishPrice) {
        this.dishPrice = dishPrice;
    }
}