package com.observer;

import java.util.ArrayList;

public class Youtuber implements Subject {
	private ArrayList<Observer> observers = new ArrayList<>();
	private String channelName;

	public Youtuber(String channelName) {
		this.channelName = channelName;
	}
	
	public String getChannelName() {
		return channelName;
	}

	public void uploadVideo(String channelName, Video video) {
		notifySubscribers(channelName, video);
	}

	@Override
	public void subscribe(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unsubscribe(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifySubscribers(String channelName, Video video) {
		for(Observer o : observers) {
			o.update(channelName, video);
		}
	}
}