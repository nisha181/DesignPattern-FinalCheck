package ObserverFactoryPattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService{

	List<INotificationObserver> observers;
	public NotificationService() {
		super();
		observers=new ArrayList<>();
	}

	@Override
	public void subscribe(INotificationObserver observer) {
		observers.add(observer);
		System.out.println("Subscriber is added successfully" + observer);
		
	}

	@Override
	public void unsubscribe(INotificationObserver observer) {
		observers.remove(observer);
		System.out.println("Subscriber is removed successfully"+ observer);
		
	}

	@Override
	public void notification() {
		for (INotificationObserver iNotificationObserver : observers) {
			if(iNotificationObserver.getNoOfTickets()>=100)
				iNotificationObserver.onTicketBooked();
		}
		
	}

}
