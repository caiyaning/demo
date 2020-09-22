package com.caiyn.pointcut;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogComponent {

    private Logger logger = LoggerFactory.getLogger(LogComponent.class);

    @Pointcut("execution(* com.caiyn.login.Login.login(..))")
    public void loginLog(){

    }

    @AfterReturning("loginLog()")
    public void loginSuccess(){
        logger.info("login success.");
    }
}
