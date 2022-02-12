package opt;

public interface Subject {
	public void subscribe(Observer observer);	//구독   (옵저버 추가)
	public void unsubscribe(Observer observer);	//구독해지(옵저버 삭제)
	public void notifySubscribers();			//모든 구독자들에게 알리기
	public void notifyPremiumSubscribers();		//프리미엄 구독자들에게 알리기
}
