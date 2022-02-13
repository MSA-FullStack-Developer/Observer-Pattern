package optApi;

import java.util.Observer;

public class TestStart {

	public static void main(String[] args) {
		Youtuber youtuber = new Youtuber("PewDiePie");	//유튜버를 생성합니다.
	
		Observer james = new NormalSubscriber("James"); //James 일반 구독자가 생성
		youtuber.addObserver(james);					//James가 구독함
		
		Observer peter = new NormalSubscriber("Peter");  //Peter 일반 구독자가 생성
		youtuber.addObserver(peter);					 //Peter가 구독함
		
		Observer tom = new PremiumSubscriber("Tom");	//Tom 프리미엄 구독자 생성
		youtuber.addObserver(tom);						//Tom이 구독함
		
		Observer jerry = new PremiumSubscriber("Jerry");	//Tom 프리미엄 구독자 생성
		youtuber.addObserver(jerry);						//Tom이 구독함
		
		youtuber.deleteObserver(james);				//James가 구독을 해제함
		
		youtuber.videoUpload();						//유튜버가 영상을 업로드 함 (모든 구독자들이 업도르 소식을 받는다.)
		
		System.out.println();
		youtuber.showInfo();
	}

}
