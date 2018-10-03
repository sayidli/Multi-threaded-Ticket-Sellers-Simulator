
public class Seats {
	boolean[][] availableSeats;
	Seat[][] seats;
	public Seats() {
		availableSeats = new boolean[10][10];
		seats = new Seat[10][10];
		for (int i = 0; i<10; i++) {
			for (int j = 0; j<10;j++) {
				seats[i][j] = new Seat(null,i,j);
			}
		}
	}
	public boolean[][] getSeatingChart() {
		return availableSeats;
	}
	public void setSold(TicketSeller seller, int i, int j) {
		availableSeats[i][j] = true;
		seats[i][j].setSeller(seller);
	}
	public void printSeatingChart() {
		for (int i = 0;i<10;i++) {
			for (int j = 0;j<10;j++) {
				if (!availableSeats[i][j]) {
					System.out.print("[_]  ");
				}else {
					System.out.print(seats[i][j].getSellerName()+seats[i][j].returnCustCount()+" ");
				}
			}
			System.out.println();
		}
	}	
}
