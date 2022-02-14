package com.observableAPI;

import java.util.Observable;
import java.util.Observer;

public class NormalSubscriber implements Observer{
	private String name;
	Observable observable;

	public NormalSubscriber(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("일반 구독자 " + name + "이(가) 영상 업로드 소식을 받았습니다.");
	}
}