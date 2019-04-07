package com.ananya.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {

	private Logger logger = LoggerFactory.getLogger(BeforeAspect.class);

	// PointCut
	// execution(* PACKAGE.*.*(..))
	@Before("com.ananya.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void before(JoinPoint joinPoint) {
		// Advice
		logger.info("Intercepted Method Calls {} ", joinPoint);
	}

}
