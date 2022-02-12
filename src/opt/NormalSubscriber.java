package opt;

public class NormalSubscriber implements Observer{

	@Override
	public void update() {
		System.out.println("일반 구독자가 소식을 받았음");
	}

}
