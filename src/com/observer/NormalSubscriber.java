package com.observer;

public class NormalSubscriber implements Observer {
	private String subscriberName;
	
	public NormalSubscriber(String subscriberName) {
		this.subscriberName = subscriberName;
	}

	@Override
	public void update(String channelName, Video video) {
		if(video instanceof NormalVideo) { // video 객체의 타입이 NormalVideo 타입인 경우에
			System.out.println("일반 구독자 "+ subscriberName + "님! '" + channelName 
					+ "' 유튜버의 ["+video.getVideoName()+"] 영상이 업로드 되었습니다!");
		}
	}
}