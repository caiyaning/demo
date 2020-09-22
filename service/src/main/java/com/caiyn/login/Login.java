package com.caiyn.login;

import com.caiyn.service.impl.TestServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Login {

    private Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    public void login(String username) {
        logger.info("hello {}", username);
    }
}
