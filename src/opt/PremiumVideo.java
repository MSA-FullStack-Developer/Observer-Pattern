package opt;

public class PremiumVideo extends Video {

	public PremiumVideo(String videoName, String videoGrade) {
		super(videoName, videoGrade);
		System.out.println(videoName +"프리미엄 비디오가 생성 되었습니다." + "이 비디오의 등급은 " + videoGrade + "입니다.");
	}

}
