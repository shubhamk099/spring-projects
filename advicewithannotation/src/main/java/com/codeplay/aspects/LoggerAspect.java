package com.codeplay.aspects;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class LoggerAspect {

    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("@annotation(com.codeplay.interfaces.LogAspect)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Method execution start");
        Instant start = Instant.now();
        Object result = joinPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method : " + timeElapsed);
        logger.info(joinPoint.getSignature().toString() + " method execution ended");
        return result;
    }
}
