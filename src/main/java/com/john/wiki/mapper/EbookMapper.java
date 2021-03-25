package com.john.wiki.mapper;

import com.john.wiki.entity.Ebook;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EbookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Ebook record);

    int insertSelective(Ebook record);

    Ebook selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Ebook record);

    int updateByPrimaryKey(Ebook record);
}