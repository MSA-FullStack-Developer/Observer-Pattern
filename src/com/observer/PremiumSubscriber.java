package com.observer;

public class PremiumSubscriber implements Observer{
	private String name;
	
	public PremiumSubscriber(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void update(Video video) {
		if(video instanceof NormalVideo) {
			System.out.println("프리미엄 구독자 "+ name + "님! ["+ video.getVideoName() +"] 영상이 업로드 되었습니다!");
		} else if(video instanceof PremiumVideo) {
			System.out.println("프리미엄 구독자 " + name + "님! [" + video.getVideoName() + "] 영상이 업로드 되었습니다! (이 영상은 프리미엄 구독자에게만 전송되는 알림입니다.)");
		}
	}
}