package week1.day5_Data_Encapsulation_and_Static_Keyword.Ticket_calculation_Static;

public class Ticket {
    private int ticketid;
	private int price;
	private static int totalnooftickets;
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getTotalnooftickets() {
		return totalnooftickets;
	}
	public static void setTotalnooftickets(int totalnooftickets) {
		Ticket.totalnooftickets = totalnooftickets;
	}
	
	public int Calculatetotalamount(int nooftickets) {
		return nooftickets*price;	
	}
}
