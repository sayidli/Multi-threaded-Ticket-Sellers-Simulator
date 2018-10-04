import java.util.PriorityQueue;

public abstract class TicketSeller implements Runnable{
	
	abstract boolean checkAvailableSeats(boolean[][] seats);
	abstract void assignSeatToCustomer();
	abstract void sell();
	abstract boolean checkIfSeatIsAssigned();
	
}
