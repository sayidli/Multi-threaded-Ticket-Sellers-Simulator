import java.util.PriorityQueue;

public class LowPriceTicketSeller extends TicketSeller {
	private SeatingMap seatingMap;
	private PriorityQueue<Customer> customerQueue;

	
	public LowPriceTicketSeller(int numOfCustomers,SeatingMap seatingMap) {
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
		for(int row=seatingMap.seats.length-1; row>=0; row--){
		for(int column=seatingMap.seats[0].length-1; column>=0; column--){
			if(seatingMap.available(row, column)){
			seatingMap.setSold(row,column);}
		}
		}
		seatingMap.printSeatingChart();
	}
}

