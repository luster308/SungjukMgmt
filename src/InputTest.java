import static org.junit.Assert.*;

import org.junit.Test;

public class InputTest {

	@Test
	public void testInput() {
		Student [] array = new Student[100];
		Input input = new Input(array);
		int count = input.input();
		assertEquals(2, count);
	}

}
