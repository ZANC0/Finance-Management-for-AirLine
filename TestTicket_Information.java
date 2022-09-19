import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTicket_Information {

	@Test
	void Test_Flight_class_cost() {
		Ticket_Information TestTicket_Information = new Ticket_Information(1782.5,1920.2,"First","0","Germany",0);
		double output = TestTicket_Information.Flight_class_cost(1782,1920);
		assertEquals(5553,output);
	}
}
