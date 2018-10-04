
public class Seat {
	private String assignmentID;
	private boolean isSold;
	
	public Seat(){
		assignmentID = "";
		isSold = false;
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
