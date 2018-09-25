package dao;

import entity.ConsumeRecords;

public interface ConsumeRecordsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ConsumeRecords record);

    int insertSelective(ConsumeRecords record);

    ConsumeRecords selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ConsumeRecords record);

    int updateByPrimaryKey(ConsumeRecords record);
}