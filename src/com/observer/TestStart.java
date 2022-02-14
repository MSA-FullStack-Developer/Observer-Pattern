package com.observer;

public class TestStart {
	public static void main(String[] args) {
		Youtuber youtuber = new Youtuber("5조");															//유튜버의 이름이 "5조"인 객체를 생성합니다.
		
		NormalSubscriber james = new NormalSubscriber("James");							//James 일반 구독자 생성
		youtuber.subscribe(james);																						//James가 구독
		youtuber.unsubscribe(james);																					//James가 구독 취소
		
		NormalSubscriber peter = new NormalSubscriber("Peter");								//Peter 일반 구독자 생성
		youtuber.subscribe(peter); 																						//Peter가 구독
		
		PremiumSubscriber tom = new PremiumSubscriber("Tom");								//Tom 프리미엄 구독자 생성
		youtuber.subscribe(tom);																							//Tom이 구독

		Video normalVideo = new NormalVideo("5조의 기묘한 모험(체험판)");				//"5조" 유튜버가 일반 등급 영상 생성
		youtuber.uploadVideo(youtuber.getChannelName(), normalVideo);				//"5조" 유튜버가 영상을 업로드
		
		Video premiumVideo = new PremiumVideo("5조의 기묘한 모험(체험판)");		//"5조" 유튜버가 프리미엄 등급 영상 생성
		youtuber.uploadVideo(youtuber.getChannelName(), premiumVideo);			//"5조" 유튜버가 영상을 업로드
	}
}