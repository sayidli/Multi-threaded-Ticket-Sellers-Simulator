import java.util.PriorityQueue;

public class LowPricedTicketSeller extends TicketSeller {

	private PriorityQueue<Customer> customerQueue;
	private Seat[][] seatingMap;
	private int rowStart = 9;
	private int availRow;
	private int avialCol;
	public LowPricedTicketSeller(int numOfCustomers, Seat[][] seatingMap) {
		customerQueue = CustomerGenerator.createCustomers(numOfCustomers);
		this.seatingMap = seatingMap;
	}
	
	@Override
	public boolean checkAvailableSeats(Seat[][] seats) {
		// Begins searching in 9th row
		for (int i = rowStart;i>=0;i--) {
			for (int j=0;j<10;j++) {
				//saves coordinates of first available seat and returns true
				if (!seats[i][j].getIsSold()) {
					saveCoordinates(i,j);
					return true;
				}
			}
		}
		//returns false if no seats are available
		return false;
	}
	//Saves coordinates to be used when assigning seat
	public void saveCoordinates(int row, int col) {
		availRow = row;
		availCol = col;
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


