package com.ankit.spring_boot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    //return type, class-name.method-name(arguments)

    //execute before the method is called
//    @Before("execution(* *.*(..))")     //for all methods
    @Before("execution(* com.ankit.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.ankit.spring_boot_rest.service.JobService.updateJob(..))")
    public void logMethodCall(JoinPoint jp){
        LOGGER.info("Method called " + jp.getSignature().getName());
    }

    //execute after the method is executed
    @After("execution(* com.ankit.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.ankit.spring_boot_rest.service.JobService.updateJob(..)) || execution(* com.ankit.spring_boot_rest.service.JobService.deleteJob(..))")
    public void logMethodExecuted(JoinPoint jp){
        LOGGER.info("Method Executed " + jp.getSignature().getName());
    }

    //execute if the method throws an exception
    @AfterThrowing("execution(* com.ankit.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.ankit.spring_boot_rest.service.JobService.updateJob(..)) || execution(* com.ankit.spring_boot_rest.service.JobService.deleteJob(..))")
    public void logMethodCrash(JoinPoint jp){
        LOGGER.info("Method has some issues " + jp.getSignature().getName());
    }

    //execute if the method returns successfully
    @AfterReturning("execution(* com.ankit.spring_boot_rest.service.JobService.getJob(..)) || execution(* com.ankit.spring_boot_rest.service.JobService.updateJob(..)) || execution(* com.ankit.spring_boot_rest.service.JobService.deleteJob(..))")
    public void logMethodExecutedSuccess(JoinPoint jp){
        LOGGER.info("Method executed successfully " + jp.getSignature().getName());
    }

}
