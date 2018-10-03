

public interface TicketSeller{

	public boolean checkAvailableSeats(boolean[][] seats);
	public void assignSeatToCustomer();
	public void sell();
	public boolean checkIfSeatIsAssigned();
	public int returnProcTime();
	public void setProcTime(int time);
	
}
