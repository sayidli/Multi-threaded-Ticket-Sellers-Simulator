
public class Customer {
	private int arrivalTime;
	public boolean successfulSale;
	public Customer(int theArrivalTime) {
		arrivalTime = theArrivalTime;
	}
	public int getArrivalTime() {
		return arrivalTime;
	}
	public void setSuccessfulSale(boolean sale) {
		successfulSale = sale;
	}
	
	public boolean isSaleSuccessful() {
		return successfulSale;
	}
}
