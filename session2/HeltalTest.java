import static org.junit.Assert.*;

import org.junit.Test;

//Blackboxtest använder klassens publika metoder


public class HeltalTest {

	@Test
	public void test() {
		Heltal h = new Heltal(3);
		Heltal h2 = new Heltal(3);
		assertNotNull(h);
		assertNotNull(h2);
		
		
	}
	
	@Test
	public void testConstructor() {
		Heltal h = new Heltal(Long.MIN_VALUE);
		assertEquals(h.toString(), ""+Long.MIN_VALUE);
		Heltal h2 = new Heltal(3);
		assertNotNull(h);
		assertNotNull(h2);
		Heltal h3 = new Heltal();
		assertEquals(h3.toString(), "0");
		
	}
	
	@Test
	public void testAdd() {
		Heltal h1 = new Heltal(3);
		Heltal h2 = new Heltal(4);
		assertEquals(h1.add(h2).toString(), "7");
	}

	@Test
	public void testSub() {
		Heltal h1 = new Heltal(3);
		Heltal h2 = new Heltal(4);
		assertEquals(h1.sub(h2).toString(), "-1");
	}
	
	@Test
	public void testMul() {
		Heltal h1 = new Heltal(3);
		Heltal h2 = new Heltal(4);
		assertEquals(h1.mul(h2).toString(), "12");
	}
	
	@Test
	public void testDiv() {
		Heltal h1 = new Heltal(3);
		Heltal h2 = new Heltal(4);
		assertEquals(h1.div(h2).toString(), "0");
	}
	
	@Test
	public void testFailure() {
		Heltal h1 = new Heltal(3);
		Heltal h2 = new Heltal();
			
		try {
			h1.div(h2);
		} catch(Exception e) {
			assertTrue(true);
			return;
		}
		assertTrue(false);
	}
}
