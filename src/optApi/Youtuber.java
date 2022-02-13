package optApi;

import java.util.Observable;

public class Youtuber extends Observable {

	private String channelName;
	private int numberOfSubscribers;
	
	public Youtuber(String channelName) {
		this.channelName = channelName;
		System.out.println(this.channelName +" 유튜버가 생성됐습니다.");
	}

	public void videoUpload() {
		System.out.println(channelName + "님의 영상이 업로드 되었습니다.");
		setChanged();
		notifyObservers();
	}
	
	public void showInfo() {
		numberOfSubscribers = countObservers();
		System.out.println("**********************************");
		System.out.println(channelName + "님의 구독자 수는 " + numberOfSubscribers + "명 입니다.");
		System.out.println("**********************************");
	}

}
