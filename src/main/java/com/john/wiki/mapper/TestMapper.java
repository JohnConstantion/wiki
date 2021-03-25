package com.john.wiki.mapper;

import com.john.wiki.entity.Test;

import java.util.List;


public interface TestMapper {
    int deleteByPrimaryKey(Integer id);

    List<Test> selectAllTest();

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}