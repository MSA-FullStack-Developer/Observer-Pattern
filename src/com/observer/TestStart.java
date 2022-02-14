package com.observer;

public class TestStart {
	public static void main(String[] args) {
		Subject team5 = new Youtuber("5조");																		//유튜버 객체를 생성합니다.
		
		NormalSubscriber james = new NormalSubscriber("James");								//James 일반 구독자 생성
		team5.subscribe(james);																								//James가 구독
		
		NormalSubscriber peter = new NormalSubscriber("Peter");									//Peter 일반 구독자 생성
		team5.subscribe(peter); 																								//Peter가 구독
		
		PremiumSubscriber tom = new PremiumSubscriber("Tom");									//Tom 프리미엄 구독자 생성
		team5.subscribe(tom);																									//Tom이 구독
		 
		team5.unsubscribe(james);																						//James가 구독을 취소

		Video nV = new NormalVideo("5조의 기묘한 모험(체험판)", "전체이용가");			//일반 등급의 비디오를 생성
		((Youtuber) team5).videoUpload(nV);																		//"5조" 유튜버가 일반 영상을 업로드
		
		Video pV = new PremiumVideo("5조의 기묘한 모험(풀버전)", "프리미엄 전용");	//프리미엄 등급의 비디오를 생성
		((Youtuber) team5).videoUpload(pV);																		//"5조" 유튜버가 프리미엄 영상을 업로드
	}
}