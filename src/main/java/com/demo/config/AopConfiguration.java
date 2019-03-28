package com.demo.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
@Aspect
@Configuration
public class AopConfiguration {
    @Pointcut("execution(* com.demo.service.*.*(..))")
    public void executeService(){

    }
   // public void
}
