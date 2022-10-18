package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;


class TestEllipse {

	@Test
	public void TestEllipseSetter() {
		Ellipse ellipse1 = null;
		ellipse1 = new Ellipse();
		
		ellipse1.setRadius(20);
		assertEquals(ellipse1.getEllipseRadius(),20);
		
	}
	@Test
	public void TestEllipseGetter() {
		Ellipse ellipse1 = null;
		ellipse1 = new Ellipse();
		assertEquals(10, ellipse1.getEllipseRadius(), 10);
	}
	
	@Test
	public void TestEllipsePerimeter() {
		Ellipse ellipse1 = null;
		try {
			ellipse1 = new Ellipse(5.0,5.0);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		assertEquals(31.41, ellipse1.perimeter(),5);
	}
	
	@Test 
	public void TestEllipseArea() {
		Ellipse ellipse1 = null;
		try {
			ellipse1 = new Ellipse(6,6);
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		assertEquals(113.1, ellipse1.area(),6);
	}

}
