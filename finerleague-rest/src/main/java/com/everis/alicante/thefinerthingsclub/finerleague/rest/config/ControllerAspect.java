package com.everis.alicante.thefinerthingsclub.finerleague.rest.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * The type Controller aspect.
 */
@Aspect
@Component
public class ControllerAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * Controller point cut.
     */
    @Pointcut("execution(* com.everis.alicante.thefinerthingsclub.finerleague.rest.controller..*(..))")
    public void controllerPointCut() {

    }

    /**
     * Log around.
     *
     * @param joinPoint the join point
     * @throws Throwable the throwable
     */
    @Before("controllerPointCut()")
    public void logBefore(final JoinPoint joinPoint) throws Throwable {
        logger.info(String.format("Method [%s], Arguments [%s] RUNNING", joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs())));
    }

    /**
     * Log after.
     *
     * @param joinPoint the join point
     * @throws Throwable the throwable
     */
    @After("controllerPointCut()")
    public void logAfter(final JoinPoint joinPoint) throws Throwable {
        logger.info(String.format("Method [%s], Arguments [%s] FINISHED", joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs())));
    }


}
