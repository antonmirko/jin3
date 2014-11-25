import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestUnit {

	@Test
	public void test() {
		Add adder = new Add();
		assertEquals( 5, adder.add(2,3));
	}

}
