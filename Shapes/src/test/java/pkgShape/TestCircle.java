package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class TestCircle {

	@Test
	public void TestCSetter() {
		Circle circle1 = null;
		circle1 = new Circle();
		circle1.setCircleRadius(5);
		assertEquals(circle1.getCircleRadius(), 5);
	}
	@Test
	public void TestCGetter() {
		Circle circle1 = null;
		circle1 = new Circle();
		assertEquals(5, circle1.getCircleRadius(), 5);
	}
	
	@Test
	public void TestCirclePerimeter() {
		Circle circle1 = null;
		try {
			circle1 = new Circle(30);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		assertEquals(188.5, circle1.perimeter(), 30);
	}
	
	@Test 
	public void TestCircleCircumference() {
		Circle circle1 = null;
		try {
			circle1 = new Circle(15);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		assertEquals(94.2, circle1.circumferance(),15);
	}
	@Test
	public void TestCircleArea() {
		Circle circle1 = null;
		try {
			circle1 = new Circle(8);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		assertEquals(201.06, circle1.area(),8);
	}
}
