public class Expenses{
	int Bag_quantity;
	double Food;
	double compensation_cost;
	double Ticket_Cost_value;
	

	public Expenses(int bags, double Food_cost, double compensation,double ticket_cost) {
		Bag_quantity = bags;
		Food = Food_cost;
		compensation_cost = compensation;
		Ticket_Cost_value = ticket_cost;
	}
	public double bag_cost_calc() {
		double Bag_cost = (Bag_quantity*25)-25;
		return Bag_cost;
	}
	public double Total_cost_calc() {
		double Bag_cost = (Bag_quantity*25)-25;
		double Total_cost_value = (Ticket_Cost_value + Bag_cost + Food) - compensation_cost;
		return Total_cost_value;
	}
}
