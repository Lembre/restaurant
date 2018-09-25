package dao;

import entity.ShopDish;

public interface ShopDishMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopDish record);

    int insertSelective(ShopDish record);

    ShopDish selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopDish record);

    int updateByPrimaryKey(ShopDish record);
}