package com.caiyn.test;

import com.caiyn.persistence.po.NewsDataSourceConfig;
import com.caiyn.service.TestService;
import com.caiyn.service.impl.TestServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DataSourceTest {

    private Logger logger = LoggerFactory.getLogger(DataSourceTest.class);

    @Test
    public void test() {

        // 创建一个app对象，把spring配置文件传入
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        TestService testService = app.getBean(TestServiceImpl.class);
        List<NewsDataSourceConfig> newsDataSourceConfigs = testService.listNewsDataSourceConfig();
        for (NewsDataSourceConfig newsDataSourceConfig : newsDataSourceConfigs) {
            logger.info("url:{}", newsDataSourceConfig.getHomeLink());
        }
        logger.info(String.format("hello %s","world"));
    }
}
