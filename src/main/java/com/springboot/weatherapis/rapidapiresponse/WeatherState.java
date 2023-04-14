package com.springboot.weatherapis.rapidapiresponse;

public class WeatherState {
	private int state;
    private String text;
    private String icon;
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
    
}
