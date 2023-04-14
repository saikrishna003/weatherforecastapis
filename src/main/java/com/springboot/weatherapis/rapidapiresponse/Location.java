package com.springboot.weatherapis.rapidapiresponse;

public class Location {
	private String code;
    private String timezone;
    private String name;
    private Coordinates coordinates;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Coordinates getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
    
}
