package com.john.wiki.service;

import com.john.wiki.req.EbookReq;
import com.john.wiki.resp.EbookResp;

import java.util.List;

/**
 * @author constantinejohn
 */
public interface EbookService {

    /**
     * 根据名称模糊查询
     *
     * @param req {@link EbookReq}
     * @return {@link List<EbookResp>}
     */
    List<EbookResp> getList(EbookReq req);
}
