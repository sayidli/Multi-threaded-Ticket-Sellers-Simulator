import java.util.Arrays;

public class Theater implements Runnable{
	
	private int theaterSize;
	private int numOfCustomers;
	private boolean[][] seats;
	private int currentTime = 0;
	private TicketSeller[] sellers;
	
	public Theater(int theaterSize, int numOfCustomers) {
		this.theaterSize = theaterSize;
		this.numOfCustomers = numOfCustomers;
		seats = new boolean[theaterSize][theaterSize];
		
		sellers = new TicketSeller[] {
				//new HighPricedTicketSeller(this),
				
				/*new MidPricedTicketSeller(this),
				new MidPricedTicketSeller(this),
				new MidPricedTicketSeller(this),
				
				new LowPricedTicketSeller(this),
				new LowPricedTicketSeller(this),
				new LowPricedTicketSeller(this),
				new LowPricedTicketSeller(this),
				new LowPricedTicketSeller(this),*/
				new LowPricedTicketSeller(this, "L6")
		};
	}
	
	public int getTheaterSize() {
		return theaterSize;
	}
	
	public int getNumOfCustomers() {
		return numOfCustomers;
	}
	
	public int getCurrentTime() {
		return currentTime;
	}
	
	public boolean[][] getSeats(){
		return seats;
	}
	
	public void printSeats() {
		for(boolean[] row : seats) {
			System.out.println(Arrays.toString(row));
		}
	}
	
	public void run() {

		boolean end = false;
		
		for(TicketSeller ts : sellers) {
			new Thread(ts).start();
		}
		
		while(!end) {
			end = true;
			for(TicketSeller ts : sellers) {
				if(ts.hasCustomersRemaining()) {
					end = false;
					ts.resetProcessedStatus();
				}
			}
			
			boolean processed = false;
			while(!processed) {
				processed = true;
				for(TicketSeller ts : sellers) {
					processed = processed && ts.hasBeenProcessed();
				}
			}
			currentTime++;
			
			System.out.println(currentTime);
		}
		System.out.println("Finished");
	}
	
	public static void main (String[] args){
		Theater t = new Theater(10, 15);
		
		new Thread(t).start();
	}
	
}
