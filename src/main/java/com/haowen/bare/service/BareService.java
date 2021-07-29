package com.haowen.bare.service;


import com.haowen.bare.parse.BareParser;
import com.haowen.bare.parse.ParserFactory;
import com.haowen.bare.result.BareResResult;
import com.haowen.bare.utils.StringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;

@Service
public class BareService {

    @Resource
    private ParserFactory parserFactory;

    /**
     * 获取无水印资源地址列表
     *
     * @param link 复制的链接
     */
    public BareResResult parse(String link) throws IOException {
        BareParser parser = parserFactory.getParser(link);
        return parser.parse(StringUtil.filterUrl(link));
    }
}
