package dao;

import entity.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(Short id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}