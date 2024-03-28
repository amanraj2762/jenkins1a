import static org.junit.Assert.*;

import org.junit.Test;

import assign1a.multiply;

public class firstTest {

	@Test
	public void test() {
		
		multiply obj = new multiply();
		int t1=obj.mul(5,2);
		int t2=10;
		assertEquals(t1,t2);
	}

	@Test
	public void test1() {
		
		multiply obj1 = new multiply();
		int t1=obj1.mul(8,2);
		int t2=16;
		assertEquals(t1,t2);
	}

}
