import static org.junit.Assert.*;

import org.junit.Test;

import de.app.Add;

public class TestAdd {
	Add adder = new Add();

	@Test
	public void test() {
		 
		assertEquals( 5, adder.add(2,3));
	}
	@Test
	public void testok()
	{
		assertEquals(7, adder.add(3, 3));
	}
	@Test
	public void testFailed()
	{
		assertNotEquals(6, adder.add(5, 5));
	}
	

}
