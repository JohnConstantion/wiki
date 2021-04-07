package com.john.wiki.service.impl;

import com.john.wiki.entity.Ebook;
import com.john.wiki.entity.EbookExample;
import com.john.wiki.mapper.EbookMapper;
import com.john.wiki.req.EbookReq;
import com.john.wiki.resp.EbookResp;
import com.john.wiki.service.EbookService;
import com.john.wiki.util.CopyUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

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

        if (!ObjectUtils.isEmpty(req.getName())) {
            criteria.andNameLike("%" + req.getName() + "%");
        }

        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        // 列表复制
        return CopyUtil.copyList(ebookList, EbookResp.class);
    }
}
