
public class Ticket_Information {
	//attributes
	double Flight_distance_to;
	double Flight_distance_return;
	String Flight_class;
	String Flight_departure_time;
	String Flight_destination;
	double Ticket_Cost_value;

	
	//constructor
	public Ticket_Information(double distance_to,double distance_return,String Fclass,String departure_time,String destination, double ticket) {
		Flight_distance_to = distance_to;
		Flight_distance_return = distance_return;
		Flight_class = Fclass;
		Flight_departure_time = departure_time;
		Flight_destination = destination;
		Ticket_Cost_value = ticket;
		

		
	}
	//method
	public double Flight_class_cost(double Flight_distance_to,double Flight_distance_return) {
		if(Flight_class == "Economy") {
			double Ticket_Cost_value = (Flight_distance_to*0.5) + (Flight_distance_return*0.5);
			return Ticket_Cost_value;
		}
		if(Flight_class == "Business") {
			double Ticket_Cost_value = (Flight_distance_to*1.0) + (Flight_distance_return*1.0);
			return Ticket_Cost_value;
		}
		if(Flight_class == "First") {
			double Ticket_Cost_value = (Flight_distance_to*1.5) + (Flight_distance_return*1.5);
			return Ticket_Cost_value;
		}
		else{
			System.out.println("You have not selected a class");
		}
		return 0;
	}
	
	
	
	
		

}
