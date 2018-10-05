
public class Theater {
	
	public static void main (String[] args){
		
		SeatingMap seatMap = new SeatingMap();
		int numOfCustomers = 5;

		HighPricedTicketSeller highPricedTicketSeller = new HighPricedTicketSeller(numOfCustomers, seatMap);
		MidPricedTicketSeller midPricedTicketSeller = new MidPricedTicketSeller(numOfCustomers, seatMap);
		LowPriceTicketSeller lowPriceTicketSeller = new LowPriceTicketSeller(numOfCustomers, seatMap);
		
		
		Thread h = new Thread(highPricedTicketSeller);
		
		Thread m1 = new Thread(midPricedTicketSeller);
		Thread m2 = new Thread(midPricedTicketSeller);
		Thread m3 = new Thread(midPricedTicketSeller);
		
		Thread l1 = new Thread(lowPriceTicketSeller);
		Thread l2 = new Thread(lowPriceTicketSeller);
		Thread l3 = new Thread(lowPriceTicketSeller);
		Thread l4 = new Thread(lowPriceTicketSeller);
		Thread l5 = new Thread(lowPriceTicketSeller);
		Thread l6 = new Thread(lowPriceTicketSeller);
		
		
			
		/*
			h.start();
			m1.start();
			m2.start();
			m3.start();
			l1.start();
			l2.start();
			l3.start();
			l4.start();
			l5.start();
			l6.start();
			
			*/
		
			
			
		
		
	}
	
}
