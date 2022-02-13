package com.observer;

import java.util.ArrayList;

public class Youtuber implements Subject {
	private ArrayList<Observer> observers = new ArrayList<>();
	private String channelName;
	private int numberOfSubscribers;

	public Youtuber(String channelName) {
		this.channelName = channelName;
		System.out.println("유튜버 "+ this.channelName + "님께서 채널을 개설하였습니다.");
	}

	public void showInfo() {
		this.numberOfSubscribers = observers.size();
		System.out.println(channelName + "님 채널의 현재 구독자 수는 " + numberOfSubscribers + "명 입니다.");
	}

	public void videoUpload(Video video) {
//		System.out.println(channelName + "님! [" + video.getVideoName() + "] 영상이 업로드 되었습니다!");
		notifySubscribers(video);
	}

	@Override
	public void subscribe(Observer observer) {
		observers.add(observer);
		String name = observer.getName();
		System.out.println(name + "님이 구독했습니다.");
	}

	@Override
	public void unsubscribe(Observer observer) {
		observers.remove(observer);
		String name = observer.getName();
		System.out.println(name + "님이 구독을 취소했습니다.");
	}

	@Override
	public void notifySubscribers(Video video) {
		for(Observer o : observers) {
			o.update(video);
		}
	}
}