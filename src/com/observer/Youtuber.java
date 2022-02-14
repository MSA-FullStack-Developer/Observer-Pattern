package com.observer;

import java.util.ArrayList;

public class Youtuber implements Subject {
	private ArrayList<Observer> observers = new ArrayList<>();
	private String channelName;
	private int numberOfSubscribers;

	public Youtuber(String channelName) {
		this.channelName = channelName;
		this.numberOfSubscribers = 0;
	}
	
	public void videoUpload(Video video) {
		notifySubscribers(video);
	}

	@Override
	public void subscribe(Observer observer) {
		this.numberOfSubscribers += 1;
		observers.add(observer);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.numberOfSubscribers -= 1;
		observers.remove(observer);
	}

	@Override
	public void notifySubscribers(Video video) {
		for(Observer o : observers) {
			o.update(video);
		}
	}
}