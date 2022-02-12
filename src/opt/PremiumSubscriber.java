package opt;

public class PremiumSubscriber implements Observer{

	@Override
	public void update() {
		System.out.println("프리미엄 구독자가 소식을 받았음");
	}

}
