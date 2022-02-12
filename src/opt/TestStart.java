package opt;

public class TestStart {

	public static void main(String[] args) {
		Subject subject = new Youtuber("PewDiePie");
		NormalSubscriber james = new NormalSubscriber("James");
		NormalSubscriber peter = new NormalSubscriber("Peter");
		PremiumSubscriber tom = new PremiumSubscriber("tom");
		
		subject.subscribe(james);
		subject.subscribe(peter);
		subject.subscribe(tom);
		subject.unSubscribe(james);
		
		((Youtuber)subject).videoUpload();
		
		((Youtuber)subject).showInfo();
	}

}
