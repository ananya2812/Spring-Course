package com.ananya.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {

	private Logger logger = LoggerFactory.getLogger(AfterAspect.class);

	// PointCut
	// execution(* PACKAGE.*.*(..))
	@AfterReturning(value = "execution(* com.ananya.springaop.business.*.*(..))", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		// Advice
		logger.info("{} Returned value {} ", joinPoint, result);
	}

	@AfterThrowing(value = "execution(* com.ananya.springaop.business.*.*(..))", throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint, Object exception) {
		// Advice
		logger.info("{} Threw Exception {} ", joinPoint, exception);
	}

	@After(value = "execution(* com.ananya.springaop.business.*.*(..))")
	public void after(JoinPoint joinPoint) {
		// Advice
		logger.info("{} After Method Call ", joinPoint);
	}

}
