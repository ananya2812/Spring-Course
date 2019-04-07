package com.ananya.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.ananya.springaop.business.*.*(..))")
	public void businessLayerExecution() {
	}

	@Pointcut("execution(* com.ananya.springaop.data.*.*(..))")
	public void dataLayerExecution() {
	}

	@Pointcut("bean(*dao*)")
	public void beanContainingDao() {
	}

	@Pointcut("within(com.ananya.springaop.data..*)")
	public void dataLayerExecutionWithWithin() {
	}

	@Pointcut("businessLayerExecution() || dataLayerExecution()")
	public void allLayerExecution() {
	}

}
