package com.caiyn.service.impl;

import com.caiyn.persistence.dao.NewsDataSourceConfigMapper;
import com.caiyn.persistence.po.NewsDataSourceConfig;
import com.caiyn.persistence.po.NewsDataSourceConfigExample;
import com.caiyn.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private NewsDataSourceConfigMapper newsDataSourceConfigMapper;

    public List<NewsDataSourceConfig> listNewsDataSourceConfig() {
        NewsDataSourceConfigExample example = new NewsDataSourceConfigExample();
        example.createCriteria().andSourceNmLike("%股");
        List<NewsDataSourceConfig> newsDataSourceConfigs = newsDataSourceConfigMapper
                .selectByExample(example);
        return newsDataSourceConfigs;
    }
}
