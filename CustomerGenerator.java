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
	
	private PriorityQueue<Customer> customerPriorityQueue;
	
	public CustomerGenerator(){
		
		//Custom comparator to compare Customer arrival times
		Comparator<Customer> arrivalTimeComparator = new Comparator<Customer>(){
			@Override
			public int compare(Customer p1, Customer p2) {
				return (int)Math.signum(p1.getArrivalTime() - p2.getArrivalTime());
			}
			
		};
		
		customerPriorityQueue = new PriorityQueue<>(arrivalTimeComparator);
	}
	
	//Method to generate Customer
	public void createCustomers(int numOfProc){
		
		Random r = new Random();
		
		for (int i = 0; i < numOfProc; i++){
			Customer customer;
			
			//Randomly generates customer arrival time @ beginning of minute
			int minArrTime = 0;
			int maxArrTime = 59;
			int randArrivalTime = r.nextInt((maxArrTime-minArrTime)+1)+minArrTime;
			
			//Assign generated values to Customer
			customer = new Customer(randArrivalTime);			
			
			customerPriorityQueue.add(customer);
		}
	}
	
	//Returns the Customer queue as an array 
	public ArrayList<Customer> getNewProcessArrayList(){
		createCustomers(26);
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		while (!customerPriorityQueue.isEmpty()){
			list.add(customerPriorityQueue.remove());
		}
		
		customerPriorityQueue.clear();
		return list;
	}
	
	public Customer peek() {
		return customerPriorityQueue.peek();
	}
	
	public Customer remove() {
		return customerPriorityQueue.remove();
	}
	
}
