package com.john.wiki.service.impl;

import com.john.wiki.entity.Ebook;
import com.john.wiki.entity.EbookExample;
import com.john.wiki.mapper.EbookMapper;
import com.john.wiki.req.EbookReq;
import com.john.wiki.resp.EbookResp;
import com.john.wiki.service.EbookService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<EbookResp> getList(EbookReq req) {
        final EbookExample ebookExample = new EbookExample();
        final EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");

        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        List<EbookResp> respList = new ArrayList<>();
        for (Ebook ebook : ebookList) {
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook, ebookResp);
            respList.add(ebookResp);
        }

        return respList;
    }
}
