package ObserverFactoryPattern;

public class TanwiadminObserver implements INotificationObserver{

	String name;
	int noOfTickets;
	
	public TanwiadminObserver() {
		super();
		this.name = "Tanwi";
	}
	public TanwiadminObserver(int noOfTickets) {
		super();
		this.name = "Tanwi";
		this.noOfTickets = noOfTickets;
	}
	@Override
	public void onTicketBooked() {
		System.out.println("more than 100 tickets has been booked received by "+name);
	}
	@Override
	public String toString() {
		return "adminObserver [name=" + name + "]";
	}
	@Override
	public int getNoOfTickets() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
