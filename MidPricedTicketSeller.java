import java.sql.Time;
import java.util.PriorityQueue;

public class MidPricedTicketSeller extends TicketSeller {

	private PriorityQueue<Customer> customerQueue;
	private Seat[][] seatingMap;

	
	public MidPricedTicketSeller(int numOfCustomers, Seat[][] seatingMap) {
		customerQueue = CustomerGenerator.createCustomers(numOfCustomers);
		this.seatingMap = seatingMap;
	}
	
	@Override
	public boolean checkAvailableSeats(boolean[][] seats) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void assignSeatToCustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkIfSeatIsAssigned() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void run() {
		
	}

}
