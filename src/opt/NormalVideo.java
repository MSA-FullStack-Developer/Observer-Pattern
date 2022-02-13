package opt;

public class NormalVideo extends Video{

	public NormalVideo(String videoName, String videoGrade) {
		super(videoName, videoGrade);
		System.out.println(videoName +"일반 비디오가 생성 되었습니다." + "이 비디오의 등급은 " + videoGrade + "입니다.");
	}

}
