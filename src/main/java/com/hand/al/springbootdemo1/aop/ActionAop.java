package com.hand.al.springbootdemo1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Aspect
@Component
public class ActionAop {

    private static final Logger log = LoggerFactory.getLogger(ActionAop.class);

    @Pointcut("execution(* com.hand.al.springbootdemo1.action..*(..))")
    public void actionPointcut(){};

    @Before("actionPointcut()")
    public void beforeAction(JoinPoint joinPoint){
        log.info("前置通知");
        log.info("参数：{}，方法签名：{}",Arrays.toString(joinPoint.getArgs()),joinPoint.getSignature().toString());
    }

    @AfterThrowing("actionPointcut()")
    public void throwAction(){
        log.info("异常通知");
    }

    @AfterReturning("actionPointcut()")
    public void afterAction(JoinPoint p){
        log.info("后置通知");
    }

    @After("actionPointcut()")
    public void endAction(JoinPoint p){
        log.info("最终通知");
    }

    @Around("actionPointcut()")
    public Object aroundAction(ProceedingJoinPoint p) throws Throwable {
        log.info("环绕前通知");
        Object[] args = p.getArgs();
        Object ret = p.proceed(args);
        log.info("环绕后通知");
        return ret;
    }


}
