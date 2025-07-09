package com.codeplay.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class VehicleStartCheckAspect {

    // don't need joinpoint hear
    @Before("execution(* com.codeplay.service.*.*(..)) && args(vehicleStarted,..)")
    public void checkVehicleStarted(JoinPoint joinPoint, boolean vehicleStarted) throws Throwable {

        if (!vehicleStarted) {
            throw new RuntimeException("Vehicle not started");
        }
    }
}
