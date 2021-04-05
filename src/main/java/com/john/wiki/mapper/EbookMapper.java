package com.john.wiki.mapper;

import com.john.wiki.entity.Ebook;
import com.john.wiki.entity.EbookExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author constantinejohn
 */
@Mapper
public interface EbookMapper {

    /**
     * 根据条件查询{@link List<Ebook>}
     *
     * @param example {@code EbookExample}
     * @return {@link List<Ebook>}
     * @author constantinejohn
     * @see List
     * @since 3.7
     */
    List<Ebook> selectByExample(EbookExample example);

    /**
     * 根据{@code id}查询参数
     *
     * @param id id
     * @return {@link Ebook}
     * @author constantinejohn
     * @since 3.7
     */
    Ebook selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Ebook record, @Param("example") EbookExample example);

    int updateByExample(@Param("record") Ebook record, @Param("example") EbookExample example);

    int updateByPrimaryKeySelective(Ebook record);

    int updateByPrimaryKey(Ebook record);
}