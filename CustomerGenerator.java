 /*
 * 
 * Generates Customers and adds them to priority queue
 * 
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class CustomerGenerator {
	
	//Method to generate Customer
	public static PriorityQueue<Customer> createCustomers(int numOfCust){
		
		
		Comparator<Customer> arrivalTimeComparator = new Comparator<Customer>(){
			@Override
			public int compare(Customer p1, Customer p2) {
				return (int)Math.signum(p1.getArrivalTime() - p2.getArrivalTime());
			}
			
		};
		
		PriorityQueue<Customer> customerPriorityQueue = new PriorityQueue<>(arrivalTimeComparator);
		
		Random r = new Random();
		
		for (int i = 0; i < numOfCust; i++){
			Customer customer;
			
			//Randomly generates customer arrival time @ beginning of minute
			int minArrTime = 0;
			int maxArrTime = 59;
			int randArrivalTime = r.nextInt((maxArrTime-minArrTime)+1)+minArrTime;
			
			//Assign generated values to Customer
			customer = new Customer(randArrivalTime);			
			
			customerPriorityQueue.add(customer);
		}
		
		return customerPriorityQueue;
		
	}
	
}
