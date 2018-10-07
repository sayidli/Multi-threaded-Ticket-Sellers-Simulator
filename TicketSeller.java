import java.util.Arrays;

public abstract class TicketSeller implements Runnable {

	private Theater theater;
	private int[] customers; // Array of arrival times for customers
	private int customerIndex = 0;
	private int arrivalIndex = 0;
	private int nextAvailable = 0;
	private boolean processedTime = false;
	private String name;

	public TicketSeller(Theater t, String name) {
		theater = t;
		customers = generateCustomers(t.getNumOfCustomers());
		System.out.println(Arrays.toString(customers));
		this.name = name;
	}

	abstract int[] checkAvailableSeats();

	public abstract int getProcessingTime();

	private int[] generateCustomers(int length) {
		int[] ret = new int[length];
		for (int i = 0; i < length; i++) {
			ret[i] = (int) (Math.random() * 100);
		}
		Arrays.sort(ret);
		return ret;
	}

	public Theater getTheater() {
		return theater;
	}

	public int[] getCustomerArray() {
		return customers;
	}

	public void makeSale() {
		if (customers[customerIndex] <= theater.getCurrentTime()) {
			synchronized (theater.getLock()) {
				int[] seatIndex = checkAvailableSeats();
				if (seatIndex != null) {
					//Check customerIndex to adjust formatting
					if(customerIndex+1<10){
						theater.assignSeats(seatIndex[0], seatIndex[1], name + "0" + (customerIndex+1));
					}else{
						theater.assignSeats(seatIndex[0], seatIndex[1], name + "" + (customerIndex+1));
					}
					theater.assignSeats(seatIndex[0], seatIndex[1], name + " " + customerIndex);
					nextAvailable = theater.getCurrentTime() + getProcessingTime();
					System.out.println(name + " Assigned Seat: " + theater.getCurrentTime());
					theater.printSeats();
				} else {
					System.out.println(name + " Theater full: " + theater.getCurrentTime());
					// theater.printSeats();
				}
				customerIndex++;
			}
		}
	}

	public boolean hasBeenProcessed() {
		return processedTime;
	}

	public void resetProcessedStatus() {
		processedTime = false;
	}

	@Override
	public void run() {
		System.out.println(name + " Start");
		while (hasCustomersRemaining()) {
			synchronized (this) {
				while (arrivalIndex < customers.length && customers[arrivalIndex] == theater.getCurrentTime()) {
					System.out.println(name + " Arrived: " + theater.getCurrentTime());
					arrivalIndex++;
				}
				if (nextAvailable <= theater.getCurrentTime()) {
					makeSale();
				}
				processedTime = true;
			}
		}
		processedTime = true;
		System.out.println(name + " Done");
	}

	public boolean hasCustomersRemaining() {
		return customerIndex < customers.length;
	}
}
