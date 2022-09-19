

public class Customers {
	String First_name;
	String Last_name;
	String DoB_day;
	String DoB_month;
	String DoB_year;
	int Ticket_quantity;
	int Ticket_number;
	
	public Customers (String FName, String LName, String BDay, String BMonth, String BYear, int tickets,int ticket_id) {
		First_name = FName;
		Last_name = LName;
		DoB_day = BDay;
		DoB_month = BMonth;
		DoB_year = BYear;
		Ticket_quantity = tickets;
		Ticket_number = ticket_id;
	}
	

	public String get_passenger_FName() {
		return First_name;
	}
	public String get_passenger_LName() {
		return Last_name;
	}
	public String get_passenger_dob() {
		return DoB_day+"/"+DoB_month+"/"+DoB_year;
	}
	public int get_passenger_ticket() {
		return Ticket_number;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
	}
}
