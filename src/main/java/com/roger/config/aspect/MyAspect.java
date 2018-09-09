package com.roger.config.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(* com.roger.dao..*.*(..))")
    public void pointCutWithExecution() {

    }


    @After("com.roger.config.aspect.MyAspect.pointCutWithExecution()")
    public void after() {
        System.out.println("after the method ");
    }

    @Around("com.roger.config.aspect.MyAspect.pointCutWithExecution()")
    public Object around(ProceedingJoinPoint proceedJoinPoint) throws Throwable {
        System.out.println("before exe method....");
        Object[] realArgs = new Object[proceedJoinPoint.getArgs().length];
        Object[] args = proceedJoinPoint.getArgs();
        int i = 0 ;
        for(Object arg : args){
           arg = arg + " ang Mary";
            realArgs[i++] = arg;
        }

        Object obj = proceedJoinPoint.proceed(realArgs);

        return obj;
    }
}
