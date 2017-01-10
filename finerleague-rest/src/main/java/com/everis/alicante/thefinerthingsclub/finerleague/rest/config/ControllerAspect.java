package com.everis.alicante.thefinerthingsclub.finerleague.rest.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
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
    @Around("controllerPointCut()")
    public void logAround(final ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(String.format("Method [%s], Arguments [%s] RUNNING", joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs())));
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            logger.error(String.format("Method [%s], Arguments [%s] EXCEPTION [%s]", joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()), throwable.getMessage()), throwable);
            throw throwable;
        } finally {
            logger.info(String.format("Method [%s], Arguments [%s] FINISHED", joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs())));
        }
    }
}
