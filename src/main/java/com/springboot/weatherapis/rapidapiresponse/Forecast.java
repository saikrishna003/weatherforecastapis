package com.springboot.weatherapis.rapidapiresponse;

import java.util.List;

public class Forecast {
	private List<ForecastItem> items;
    private String forecastDate;
    private String nextUpdate;
    private String source;
    private String point;
	public List<ForecastItem> getItems() {
		return items;
	}
	public void setItems(List<ForecastItem> items) {
		this.items = items;
	}
	public String getForecastDate() {
		return forecastDate;
	}
	public void setForecastDate(String forecastDate) {
		this.forecastDate = forecastDate;
	}
	public String getNextUpdate() {
		return nextUpdate;
	}
	public void setNextUpdate(String nextUpdate) {
		this.nextUpdate = nextUpdate;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
    
}
