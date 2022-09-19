public class Compensation {
	double delay;
	public Compensation(double d) {
		delay = d;//in minutes
	}
	
	public double Compensation_calc() {
		if((delay/60) >1 && (delay/60) <=2) {
			double Compensation_cost = 100.0;
			return Compensation_cost;
			
		}
		else if((delay/60) > 2 && (delay/60) <= 3) {
			double Compensation_cost = 200.0;
			return Compensation_cost;
		}
		else if((delay/60)>3) {
			double Compensation_cost = 300.0;
			return Compensation_cost;
		}
		else {
			double Compensation_cost = 0.0;
			return Compensation_cost;
		}
	}
}
