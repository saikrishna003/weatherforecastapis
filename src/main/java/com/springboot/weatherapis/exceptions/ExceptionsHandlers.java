package com.springboot.weatherapis.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionsHandlers {
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public Map<String,String> handleException(Exception ex){
		Map<String, String> error = new HashMap<>();
		error.put("error", ex.getMessage());
		return error;
	}
	
}
