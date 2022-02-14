package com.observer;

public interface Subject {
	public void subscribe(Observer observer);											//구독 (옵저버 추가)
	public void unsubscribe(Observer observer);										//구독해지(옵저버 삭제)
	public void notifySubscribers(String channelName, Video video); 	//모든 구독자들에게 알리기
}