import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_Compensation {

	@Test
	void Test_Compensation() {
		Compensation Test_Compensation = new Compensation(120);
		double output = Test_Compensation.Compensation_calc();
		assertEquals(100,output);
	}

}
