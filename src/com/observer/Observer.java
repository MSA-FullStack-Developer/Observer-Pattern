package com.observer;

public interface Observer {
	public void update(String channelName, Video video);	//구독자에게 비디오 업로드 알림 전송
}