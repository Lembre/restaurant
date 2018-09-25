package dao;

import entity.TableOrder;

public interface TableOrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(TableOrder record);

    int insertSelective(TableOrder record);

    TableOrder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(TableOrder record);

    int updateByPrimaryKey(TableOrder record);
}