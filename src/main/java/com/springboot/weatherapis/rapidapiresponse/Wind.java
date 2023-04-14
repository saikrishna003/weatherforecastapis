package com.springboot.weatherapis.rapidapiresponse;

public class Wind {
	private String unit;
    private String direction;
    private double avg;
    private double min;
    private double max;
    private String text;
    private boolean significationWind;
    private WindGusts gusts;
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public double getMin() {
		return min;
	}
	public void setMin(double min) {
		this.min = min;
	}
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isSignificationWind() {
		return significationWind;
	}
	public void setSignificationWind(boolean significationWind) {
		this.significationWind = significationWind;
	}
	public WindGusts getGusts() {
		return gusts;
	}
	public void setGusts(WindGusts gusts) {
		this.gusts = gusts;
	}
    
    
}
