package com.john.wiki.service.impl;

import com.john.wiki.entity.Ebook;
import com.john.wiki.mapper.EbookMapper;
import com.john.wiki.service.EbookService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author constantinejohn
 */
@Service
public class EbookServiceImpl implements EbookService {
    private final EbookMapper ebookMapper;

    public EbookServiceImpl(EbookMapper ebookMapper) {
        this.ebookMapper = ebookMapper;
    }

    @Override
    public List<Ebook> getList() {
        return ebookMapper.getList();
    }
}
