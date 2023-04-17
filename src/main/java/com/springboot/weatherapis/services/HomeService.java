package com.springboot.weatherapis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.springboot.weatherapis.rapidapiresponse.WeatherForeCast;

@Service
public class HomeService {
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@Value("${rapidAPIKey}")
	private String rapidApiKey;
	private String rapidApiHost = "forecast9.p.rapidapi.com";
	
	public WeatherForeCast getForeCastSummary(String city) {
        return webClientBuilder.build()
        		.get()
                .uri(uriBuilder -> uriBuilder
                        .scheme("https")
                        .host(rapidApiHost)
                        .path("/rapidapi/forecast/" + city + "/summary/")
                        .build())
                .header("X-RapidAPI-Key", rapidApiKey)
                .header("X-RapidAPI-Host", rapidApiHost)
                .retrieve()
                .bodyToMono(WeatherForeCast.class).block();
    }
	
	public WeatherForeCast getHourlyForeCast(String city) {
        return webClientBuilder.build()
        		.get()
                .uri(uriBuilder -> uriBuilder
                        .scheme("https")
                        .host(rapidApiHost)
                        .path("/rapidapi/forecast/" + city + "/hourly/")
                        .build())
                .header("X-RapidAPI-Key", rapidApiKey)
                .header("X-RapidAPI-Host", rapidApiHost)
                .retrieve()
                .bodyToMono(WeatherForeCast.class).block();
    }

}
