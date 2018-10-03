
public class Seat {
	public TicketSeller seller;
	public String custCount = "";
	public int row;
	public int col;
	public Seat(TicketSeller aSeller, int aRow, int aCol) {
		seller = aSeller;
		row = aRow;
		col = aCol;
	}
	public String getSellerName() {
		return seller.getName();
	}
	public void setSeller(TicketSeller aSeller) {
		seller = aSeller;
		seller.incrementCustCount();
		custCount = seller.getCustCount();
	}
	public String returnCustCount() {
		return custCount;
	}
	public TicketSeller getSeller() {
		return seller;
	}
	public int getRow() {
		return row;
	}
	public int getCol() {
		return col;
	}
}
