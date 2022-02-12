package opt;

public class TestStart {

	public static void main(String[] args) {
		Subject subject = new Youtuber();
		
		NormalSubscriber normalSubscriber = new NormalSubscriber();
		PremiumSubscriber premiumSubscriber = new PremiumSubscriber();
		
		subject.subscribe(normalSubscriber);
		subject.subscribe(premiumSubscriber);
	}

}
