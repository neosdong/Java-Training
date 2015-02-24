package com.neosdong;

public class WeatherData implements Obserable{
	
	private String city;
	private int temperature;
	private int humidify;
	private int pressure;
	
	
	
	private Observer observerDisplayer;
		
	public WeatherData(String city,int temperature,int humidify,int pressure,
			Observer observerDisplayer) {
		this.city = city;
		this.temperature = temperature;
		this.humidify = humidify;
		this.pressure = pressure;
		registerObserver(observerDisplayer);
	}
	
	public void setData(int temperature,int humidify,int pressure) {
		this.temperature = temperature;
		this.humidify = humidify;
		this.pressure = pressure;
		if (this.observerDisplayer!=null) {
			notifyObserver();
		}
	}
	

	@Override
	public void registerObserver(Observer observerDisplayer) {
		this.observerDisplayer = observerDisplayer;
	}

	@Override
	public void removeObserver() {
		this.observerDisplayer = null;
		
	}

	@Override
	public void notifyObserver() {
		if (this.observerDisplayer!=null) {
			this.observerDisplayer.update(this);
		}
	}

	public String getCity() {
		return city;
	}

	public int getHumidify() {
		return humidify;
	}

	public int getPressure() {
		return pressure;
	}
	
	public int getTemperature(){
		return temperature;
	}


}
