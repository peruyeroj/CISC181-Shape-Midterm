package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class TestEllipsoid {

	@Test
	public void TestEllipsoidSet() {
		Ellipsoid ellipsoid1 = null;
		ellipsoid1 = new Ellipsoid();
		
		ellipsoid1.setRadius(5);
		assertEquals(ellipsoid1.getRadius(),5);
	}
	
	@Test
	public void TestEllipsoidGetter() {
		Ellipsoid ellipsoid1 = null;
		ellipsoid1 = new Ellipsoid();
		
		assertEquals(20, ellipsoid1.getRadius(),20);
	}
	
	@Test
	public void TestElVolume() {
		Ellipsoid ellipsoid1 = null;
		try {
			ellipsoid1 = new Ellipsoid(30,30,30);
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		assertEquals(113097.33, ellipsoid1.volume(),30);
	}
		
}
