package opt;

public class PremiumSubscriber implements Observer{
	
	private String name;
	
	public PremiumSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update(Video video) {
		if(video instanceof NormalVideo) {
			System.out.println("프리미엄 구독자 " + name + "이(가) " + video.getVideoName() + " 영상 업로드 소식을 받았습니다.");
		}else if(video instanceof PremiumVideo) {
			System.out.println("프리미엄 구독자 " + name + "이(가) " + video.getVideoName() + " 영상 업로드 소식을 받았습니다. (이 영상은 프리미엄 구독자만 볼 수 있습니다.)");
		}

	}

	@Override
	public String getName() {
		return name;
	}

}
