public class SeatingMap {
		
		
		private String assignmentID;
		private boolean isSold;
		
//		public Seat(){
//			assignmentID = "";
//			isSold = false;
//		}
//		
		
		boolean[][] seats;
		
		public void setSold(int i, int j) {
			seats[i][j] = true;
}
		
		
		public SeatingMap() {
			seats = new boolean[10][10];
		}
		
			public boolean available(int i, int j){
				return !seats[i][j];
			}
		
		public boolean[][] getSeatingChart() {
			return seats;
		}
		
		public void printSeatingChart() {
			int rows=seats.length;
			int columns=seats[0].length;
			for(int i=0;i<rows; i++){
				for(int j=0; j<columns; j++){
					System.out.print(seats[i][j]+"   ");
				}
				System.out.println();
			}	
			}
		
		public boolean getIsSold(){
			return isSold;
		}
		
		public void setSold(){
			isSold = true;
		}
		
		
		public void setAssignmentID(String id){
			assignmentID = id;
		}
		
		public String getAssignmentID(){
			return assignmentID;
		}
		
	}
