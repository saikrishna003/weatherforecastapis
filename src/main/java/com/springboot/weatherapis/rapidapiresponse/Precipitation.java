package com.springboot.weatherapis.rapidapiresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Precipitation {
	private double sum;
    private double sumAsRain;
    private int probability;
    @JsonProperty("class")
    private int precipClass;
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public double getSumAsRain() {
		return sumAsRain;
	}
	public void setSumAsRain(double sumAsRain) {
		this.sumAsRain = sumAsRain;
	}
	public int getProbability() {
		return probability;
	}
	public void setProbability(int probability) {
		this.probability = probability;
	}
	public int getPrecipClass() {
		return precipClass;
	}
	public void setPrecipClass(int precipClass) {
		this.precipClass = precipClass;
	}
    
}
