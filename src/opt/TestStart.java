package opt;

public class TestStart {

	public static void main(String[] args) {
		Subject subject = new Youtuber("PewDiePie");	//유튜버를 생성합니다.
		
		NormalSubscriber james = new NormalSubscriber("James");	//James 일반 구독자가 생성
		subject.subscribe(james);								//James가 구독함
		
		NormalSubscriber peter = new NormalSubscriber("Peter"); //peter 일반 구독자가 생성
		subject.subscribe(peter); 								//peter가 구독함
		
		PremiumSubscriber tom = new PremiumSubscriber("tom");   //tom 일반 구독자가 생성
		subject.subscribe(tom);									//tom이 구독함
		
		((Youtuber)subject).showInfo();
		
		subject.unSubscribe(james);				//James가 구독을 해제함
		
		((Youtuber)subject).videoUpload();		//유튜버가 영상을 업로드 함 (모든 구독자들이 업도르 소식을 받는다.)
		
		((Youtuber)subject).showInfo();			
	}

}
