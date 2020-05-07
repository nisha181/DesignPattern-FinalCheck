package ObserverFactoryPattern;

public class Main {
	public static void main(String[] args) {
		INotificationObserver obj1=new TanwiadminObserver(90);
		INotificationObserver obj2=new NishaadminObserver(100);
		NotificationService service=new NotificationService();
		service.subscribe(obj1);
		service.subscribe(obj2);
		service.notification();
		service.unsubscribe(obj1);
	}
}
