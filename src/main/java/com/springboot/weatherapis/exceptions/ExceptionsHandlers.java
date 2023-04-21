package com.springboot.weatherapis.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import io.jsonwebtoken.JwtException;

@RestControllerAdvice
public class ExceptionsHandlers {
	
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	@ExceptionHandler(BadCredentialsException.class)
	public Map<String,String> handleExceptionUnAuthorize(BadCredentialsException ex){
		Map<String, String> error = new HashMap<>();
		error.put("error", "Invalid Credentials");
		return error;
	}
	
	@ResponseStatus(HttpStatus.FORBIDDEN)
	@ExceptionHandler(JwtException.class)
	public Map<String,String> handleExceptionJwtException(JwtException ex){
		Map<String, String> error = new HashMap<>();
		error.put("error", ex.getMessage());
		return error;
	}
	
	@ResponseStatus(HttpStatus.FORBIDDEN)
	@ExceptionHandler(UsernameNotFoundException.class)
	public Map<String,String> handleExceptionForbidden(UsernameNotFoundException ex){
		Map<String, String> error = new HashMap<>();
		error.put("error", "Unknown user");
		return error;
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public Map<String,String> handleException(Exception ex){
		Map<String, String> error = new HashMap<>();
		error.put("error", ex.getMessage());
		return error;
	}
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(WebClientResponseException.class)
	public Map<String,String> handleExceptionWeb(WebClientResponseException ex){
		Map<String, String> error = new HashMap<>();
		error.put("error", "rapidapi/webclient response exception");
		return error;
	}
}
