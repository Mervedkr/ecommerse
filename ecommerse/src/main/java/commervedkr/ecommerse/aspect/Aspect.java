package commervedkr.ecommerse.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

@Aspect
@Component
public class Aspect {
	private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

	@Pointcut("execution(public * com.yeehom.ecommerseminiprog.controller.*.*(..))")
	public void log() {
	}

	@Before("log()")
	public void logBefore(JoinPoint joinPoint) {
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		
		logger.info("url={}", request.getRequestURL());
		logger.info("method={}", request.getMethod());
		logger.info("ip={}", request.getRemoteAddr());
		logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + joinPoint.getSignature().getName());
		logger.info("args={}", joinPoint.getArgs());
	}
	
	@AfterReturning(returning = "object", pointcut = "log()")
	public void logAfterReturning(Object object)
	{
		logger.info("response={}", object.toString());
	}
}
