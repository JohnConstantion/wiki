package com.john.wiki.controller;

import com.john.wiki.entity.Ebook;
import com.john.wiki.req.EbookReq;
import com.john.wiki.resp.CommonResp;
import com.john.wiki.resp.EbookResp;
import com.john.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author constantinejohn
 */
@RestController
@RequestMapping("/ebook")
public class EbookController {

    private final EbookService ebookService;

    public EbookController(EbookService ebookService) {
        this.ebookService = ebookService;
    }

    /**
     * 查询电子书列表
     *
     * @return {@link CommonResp}
     */
    @GetMapping("/get_list")
    public CommonResp<List<EbookResp>> getList(EbookReq req) {
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> ebooks = ebookService.getList(req);
        resp.setContent(ebooks);
        return resp;
    }
}
