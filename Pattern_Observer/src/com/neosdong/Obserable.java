package com.neosdong;

public interface Obserable {
	void removeObserver();
	void notifyObserver();
	void registerObserver(Observer observerDisplayer);
}
