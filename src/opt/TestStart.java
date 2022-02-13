package opt;

public class TestStart {

	public static void main(String[] args) {
		Subject subject = new Youtuber("PewDiePie");	//유튜버를 생성합니다.
		System.out.println("-----------------------");
		NormalSubscriber james = new NormalSubscriber("James");	//James 일반 구독자 생성
		subject.subscribe(james);								//James가 구독함
		
		NormalSubscriber peter = new NormalSubscriber("Peter"); //peter 일반 구독자 생성
		subject.subscribe(peter); 								//peter가 구독함
		
		PremiumSubscriber tom = new PremiumSubscriber("Tom");   //tom 프리미엄 구독자 생성
		subject.subscribe(tom);									//tom이 구독함
		
		System.out.println("-----------유튜버 정보-----------");
		((Youtuber)subject).showInfo();
		System.out.println("------------------------------");
		
		subject.unSubscribe(james);				//James가 구독을 해제함
		System.out.println("------------------------------");
		
		Video nV = new NormalVideo("5조의 기묘한 모험(체험판)", "전체이용가");	//비디오를 생성함
		Video pV = new PremiumVideo("5조의 기묘한 모험(풀버전)", "프리미엄 전용");	//비디오를 생성함
		System.out.println("------------------------------");
		
		((Youtuber)subject).videoUpload(nV);		//유튜버가 일반 영상을 업로드 함 (모든 구독자들이 업도르 소식을 받는다.)
		System.out.println("------------------------------");
		((Youtuber)subject).videoUpload(pV);		//유튜버가 프리미엄 영상을 업로드 함 (모든 구독자들이 업도르 소식을 받는다.)
		
		System.out.println("-----------유튜버 정보-----------");
		((Youtuber)subject).showInfo();
		
	}

}
