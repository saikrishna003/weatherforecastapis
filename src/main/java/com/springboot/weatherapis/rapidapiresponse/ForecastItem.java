package com.springboot.weatherapis.rapidapiresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ForecastItem {
	private String date;
    private int period;
    private double freshSnow;
    private WeatherState weather;
    private double sunHours;
    private double rainHours;
    private Precipitation prec;
    private Temperature temperature;
    private double pressure;
    private int relativeHumidity;
    private Clouds clouds;
    private Wind wind;
    private Windchill windchill;
    private SnowLine snowLine;
    @JsonProperty("isNight")
    private boolean isNight;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public double getFreshSnow() {
		return freshSnow;
	}
	public void setFreshSnow(double freshSnow) {
		this.freshSnow = freshSnow;
	}
	public WeatherState getWeather() {
		return weather;
	}
	public void setWeather(WeatherState weather) {
		this.weather = weather;
	}
	public double getSunHours() {
		return sunHours;
	}
	public void setSunHours(double sunHours) {
		this.sunHours = sunHours;
	}
	public double getRainHours() {
		return rainHours;
	}
	public void setRainHours(double rainHours) {
		this.rainHours = rainHours;
	}
	public Precipitation getPrec() {
		return prec;
	}
	public void setPrec(Precipitation prec) {
		this.prec = prec;
	}
	public Temperature getTemperature() {
		return temperature;
	}
	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public int getRelativeHumidity() {
		return relativeHumidity;
	}
	public void setRelativeHumidity(int relativeHumidity) {
		this.relativeHumidity = relativeHumidity;
	}
	public Clouds getClouds() {
		return clouds;
	}
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public Windchill getWindchill() {
		return windchill;
	}
	public void setWindchill(Windchill windchill) {
		this.windchill = windchill;
	}
	public SnowLine getSnowLine() {
		return snowLine;
	}
	public void setSnowLine(SnowLine snowLine) {
		this.snowLine = snowLine;
	}
	public boolean isNight() {
		return isNight;
	}
	public void setNight(boolean isNight) {
		this.isNight = isNight;
	}
    
    
}
