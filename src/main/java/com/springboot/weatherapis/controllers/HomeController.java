package com.springboot.weatherapis.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.weatherapis.Utils.JwtUtil;
import com.springboot.weatherapis.dto.AuthRequest;
import com.springboot.weatherapis.rapidapiresponse.WeatherForeCast;
import com.springboot.weatherapis.services.HomeService;

@RestController
@RequestMapping("/weatherapis")
public class HomeController {

	@Autowired
	private HomeService homeService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@GetMapping
	public ResponseEntity<String> hello(){
		return new ResponseEntity<String>("Hello Weather", HttpStatus.OK);
	}
	
	@GetMapping("/forecast/{city}/summary")
	public ResponseEntity<WeatherForeCast> getForecastSummaryByLocationName(@PathVariable String city){
		Optional<WeatherForeCast> weatherForeCast = Optional.ofNullable(homeService.getForeCastSummary(city));
		if(weatherForeCast.isEmpty())
			return new ResponseEntity<WeatherForeCast>(HttpStatus.NO_CONTENT);
		else
			return new ResponseEntity<WeatherForeCast>(weatherForeCast.get(),HttpStatus.OK);
	}
	
	@GetMapping("/forecast/{city}/hourly")
	public ResponseEntity<WeatherForeCast> getHourlyForecastByLocationName(@PathVariable String city){
		Optional<WeatherForeCast> weatherForeCast = Optional.ofNullable(homeService.getHourlyForeCast(city));
		if(weatherForeCast.isEmpty())
			return new ResponseEntity<WeatherForeCast>(HttpStatus.NO_CONTENT);
		else
			return new ResponseEntity<WeatherForeCast>(weatherForeCast.get(),HttpStatus.OK);
	}
	
	@PostMapping("/authenticate")
	public ResponseEntity<String> authentication(@RequestBody AuthRequest authRequest){
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
		return new ResponseEntity<String>(jwtUtil.generateToken(authRequest.getUsername()), HttpStatus.OK);
	}
}
