package opt;

public class NormalSubscriber implements Observer{

	private String name;
	
	public NormalSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println("일반 구독자 " + name + "이(가) 영상 업로드 소식을 받았습니다.");
	}

	public String getName() {
		return name;
	}
	

}
