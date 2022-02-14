package com.observer;

public abstract class Video {
	private String videoName;
	
	public Video(String videoName) {
		this.videoName = videoName;
	}

	public String getVideoName() {
		return videoName;
	}
}