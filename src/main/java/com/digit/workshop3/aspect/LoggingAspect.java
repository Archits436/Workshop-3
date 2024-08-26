package com.digit.workshop3.aspect;

import org.aspectj.lang.annotation.Before;

public class LoggingAspect {
    @Before("execution(* com.digit.workshop3.service.*.*(..))")
    public void logBeforeServiceMethods(){
        System.out.println("A method in the service layer is being executed...");
    }
}
