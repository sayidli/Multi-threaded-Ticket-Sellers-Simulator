import java.util.Comparator;
import java.util.PriorityQueue;

public class TicketSeller implements Runnable{
	public int procTime;
	private PriorityQueue<Customer> queue;
	public TicketSeller(String name, int saleTime) {
		Comparator<Customer> c = new Comparator<Customer>(){
			@Override
			public int compare(Customer p1, Customer p2) {
				return (int)Math.signum(p1.getArrivalTime() - p2.getArrivalTime());
			}
			
		};
		queue = new PriorityQueue<Customer>(c);
		procTime = saleTime;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	public boolean checkAvailableSeats(boolean[][] seats) {
		return false;
	}
	public void assignSeatToCustomer() {
		
	}
	public void sell(){
		
	}
	public boolean checkIfSeatIsAssigned() {
		return false;
	}
	public int returnProcTime() {
		return procTime;
	}
	public void setProcTime(int time) {
		procTime = time;
	}
	
}
