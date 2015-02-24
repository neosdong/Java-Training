package com.neosdong;

public class WeatherDisplayer implements Observer{

	private WeatherData weatherData;
	private String city;
	private int temperature;
	private int humidify;
	private int pressure;
	
	@Override
	public void update(Object arg0) {
		weatherData = (WeatherData)arg0;
		city = weatherData.getCity();
		temperature = weatherData.getTemperature();
		humidify = weatherData.getHumidify();
		pressure = weatherData.getPressure();
		display();
	}

	private void display() {
		System.out.println(city+"'s weather:"
				+temperature+".c,"
				+humidify+","
				+pressure);
		
	}
	
	

	

}
