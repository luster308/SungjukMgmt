import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class InputTest {
	private Student [] array;
	
	@Before
	public void init() {
		this.array = new Student[100];
	}
	
	@Ignore @Test
	public void test() {
		assertNotNull(this.array);
	}
	@Test
	public void testInput() {
		Input input = new Input(array);
		int count = input.input();
//		assertEquals(2, count);
		assertEquals("한지민", this.array[0].getName());
	}

}
