package com.springboot.weatherapis.rapidapiresponse;

public class WeatherForeCast {

	 private Location location;
	 private Forecast forecast;
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Forecast getForecast() {
		return forecast;
	}
	public void setForecast(Forecast forecast) {
		this.forecast = forecast;
	}
	 
}
