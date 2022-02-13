package optApi;

import java.util.Observable;
import java.util.Observer;

public class PremiumSubscriber implements Observer{
	
	private String name;
	
	public PremiumSubscriber(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("프리미엄 구독자 " + name + "이(가) 영상 업로드 소식을 받았습니다.");
	}

}
