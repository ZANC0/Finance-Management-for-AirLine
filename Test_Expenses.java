import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_Expenses {

	@Test
	void Test_bag_cost_calc() {
		Expenses Test_Expenses = new Expenses(2,25,100,5553);
		double output = Test_Expenses.bag_cost_calc();
		assertEquals(25,output);
	}
	
	@Test
	void Test_Total_cost_calc() {
		Expenses Test_Expenses = new Expenses(2,25,100,5553);
		double output = Test_Expenses.Total_cost_calc();
		assertEquals(5503,output);
	}
}
