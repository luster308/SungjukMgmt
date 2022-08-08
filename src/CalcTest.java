import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void testCalc() {
		Student [] array = {new Student("2022-001", "한지민", 67, 89, 100, 77)};
		Calc calc = new Calc(array);
		calc.calc(array.length);
		assertEquals(67+89+100+77, array[0].getTot());
	}

}
