package opt;

public class PremiumSubscriber implements Observer{
	
	private String name;
	
	public PremiumSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println("프리미엄 구독자 " + name + "이(가) 영상 업로드 소식을 받았습니다.");
	}

	@Override
	public String getName() {
		return name;
	}

}
