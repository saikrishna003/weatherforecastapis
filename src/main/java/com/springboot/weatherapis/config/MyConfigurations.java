package com.springboot.weatherapis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class MyConfigurations {

	@Bean
	public WebClient.Builder getWebClientBuilder() {
	    return WebClient.builder();
	}
}
