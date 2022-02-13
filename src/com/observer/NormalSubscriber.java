package com.observer;

public class NormalSubscriber implements Observer {
	private String name;
	
	public NormalSubscriber(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public void update(Video video) {
		if(video instanceof NormalVideo) {
			System.out.println("일반 구독자 "+name+"님! ["+video.getVideoName()+"] 영상이 업로드 되었습니다!");
		}
	}
}