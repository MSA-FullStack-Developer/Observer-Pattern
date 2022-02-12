package opt;

import java.util.ArrayList;

public class Youtuber implements Subject {

	private ArrayList<Observer> observers = new ArrayList<>();
	private String channelName;
	
	
	public Youtuber() {
		System.out.println("익명의 유튜버가 생겼습니다.");
		System.out.println("-------------------");
	}
	

	public Youtuber(String channelName) {
		this.channelName = channelName;
		System.out.println(this.channelName +" 유튜버가 생겼습니다.");
		System.out.println("-------------------");
	}


	@Override
	public void subscribe(Observer observer) {
		observers.add(observer);
		System.out.println("구독자가 1명 추가됐습니다.");
	}

	@Override
	public void unsubscribe(Observer observer) {
		observers.remove(observer);
		System.out.println("구독자가 1명 사라졌습니다.");
	}

	@Override
	public void notifySubscribers() {
		for(Observer o : observers) {
			o.update();
		}
		
	}

	@Override
	public void notifyPremiumSubscribers() {
		// TODO Auto-generated method stub
		
	}

}
