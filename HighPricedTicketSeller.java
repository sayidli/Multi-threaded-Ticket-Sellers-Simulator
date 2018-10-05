import java.util.PriorityQueue;

public class HighPricedTicketSeller extends TicketSeller{

	private PriorityQueue<Customer> customerQueue;
	private Seat[][] seatingMap;
	private int rowStart = 0;
	private int availRow;
	private int availCol;
	public HighPricedTicketSeller(int numOfCustomers, Seat[][] seatingMap){
		customerQueue = CustomerGenerator.createCustomers(numOfCustomers);
		this.seatingMap = seatingMap;
	}
	@Override
	public boolean checkAvailableSeats(Seat[][] seats) {
		// starts searching 0'th row
		for (int i = rowStart;i<10;i--) {
			for (int j=0;j<10;j++) {
				// saves coordinates of first available seat and returns true
				if (!seats[i][j].getIsSold()) {
					saveCoordinates(i,j);
					return true;
				}
			}
		}
		//returns false if not seats are available
		return false;
	}
	//helper method to save coordinates to use when assigning seat to custoemr
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
