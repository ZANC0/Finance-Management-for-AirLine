import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCustomersMethods {

	@Test
	void Test_get_passenger_FName() {
		Customers TestCustomerMethods = new Customers("Aaron","Samuels","11","10","2002",2,83746579);
		String output = TestCustomerMethods.get_passenger_FName();
		assertEquals("Aaron",output);
	}
	
	@Test
	void Test_get_passenger_LName() {
		Customers TestCustomerMethods = new Customers("Aaron","Samuels","11","10","2002",2,83746579);
		String output = TestCustomerMethods.get_passenger_LName();
		assertEquals("Samuels",output);
	}
	
	@Test
	void Test_get_passenger_dob() {
		Customers TestCustomerMethods = new Customers("Aaron","Samuels","11","10","2002",2,83746579);
		String output = TestCustomerMethods.get_passenger_dob();
		assertEquals("11/10/2002",output);
	}
	
	@Test
	void Test_get_passenger_ticket() {
		Customers TestCustomerMethods = new Customers("Aaron","Samuels","11","10","2002",2,83746579);
		int output = TestCustomerMethods.get_passenger_ticket();
		assertEquals(83746579,output);
	}

}
