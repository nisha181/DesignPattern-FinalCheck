package ObserverFactoryPattern;

public class NishaadminObserver implements INotificationObserver{

	private String name;
	private int noOfTickets;
	public NishaadminObserver(int noOfTickets) {
		super();
		this.name = "Nisha";
		this.noOfTickets = noOfTickets;
	}
	@Override
	public void onTicketBooked() {
		System.out.println("more than 100 tickets has been booked : received by "+name);
	}
	@Override
	public String toString() {
		return "adminObserver [name=" + name + "]";
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	

}
