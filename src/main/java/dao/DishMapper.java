package dao;

import entity.Dish;

public interface DishMapper {
    int deleteByPrimaryKey(String dishId);

    int insert(Dish record);

    int insertSelective(Dish record);

    Dish selectByPrimaryKey(String dishId);

    int updateByPrimaryKeySelective(Dish record);

    int updateByPrimaryKey(Dish record);
}