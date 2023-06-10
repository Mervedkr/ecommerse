package commervedkr.ecommerse.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import commervedkr.ecommerse.model.Result;
import commervedkr.ecommerse.model.ResultUtil;

@ControllerAdvice
public class Exception {
private static final Logger logger = LoggerFactory.getLogger(Exception.class);
	
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public Result<Object> handle(Exception e) {
		logger.error("Http error {}", e);
		return ResultUtil.failure("Exception occured.", e.getMessage());
	}
}
