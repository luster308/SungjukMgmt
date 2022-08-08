import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class SortTest {

	@Test
	public void testBubbleSort() {
		Student [] array = new Student[] {
				new Student(), new Student()
		};
		array[0].setName("한지민");		array[0].setTot(360);
		array[1].setName("박지민");		array[1].setTot(370);
		Sort sort = new Sort(array, array.length);
		sort.bubbleSort();
		assertEquals("박지민", array[0].getName());
	}

	@Ignore @Test
	public void testSelectionSort() {
	}

}
