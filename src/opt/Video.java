package opt;

abstract class Video {
	
	private String videoName;
	private String videoGrade;
	
	public Video(String videoName, String videoGrade) {
		this.videoName = videoName;
		this.videoGrade = videoGrade;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getVideoGrade() {
		return videoGrade;
	}

	public void setVideoGrade(String videoGrade) {
		this.videoGrade = videoGrade;
	}
	
	
}
