package com.neosdong;

/**
 * 20150224
 * 观察者模式就是回调的实现：继承两个接口，形成观察者与被观察者两种角色
 * 观察者：被回调更新数据。这里WeatherDisplayer显示器是观察者
 * 被观察者：绑定观察者，调用观察者。WeatherData，气象数据是被观察者
 * @author leon
 *
 */
public class MainClass {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData("Beijing", 
				10, 30, 100, new WeatherDisplayer());
		weatherData.setData(11, 32, 101);
		weatherData.setData(11, 32, 102);
	}
}
