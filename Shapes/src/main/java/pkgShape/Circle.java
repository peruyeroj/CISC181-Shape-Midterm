package pkgShape;
import java.io.IOException;

public class Circle extends Shape {

	private double circleRadius;
	
	
	public Circle() {
		
	}
	public Circle(double radius) throws IOException{
		super();
		if (radius <= 0) {
			throw new IllegalArgumentException();
		}
		this.setCircleRadius(radius);
	}


	protected double getCircleRadius() {
		return circleRadius;
	}
	
	protected void setCircleRadius(double radius) {
		circleRadius = radius;
	}
	@Override
	public double area() {
		return Math.PI * Math.pow(circleRadius, 2);
	}
	@Override
	public double perimeter() {
		circleRadius = this.getCircleRadius();
		return 2 * Math.PI * circleRadius;
	}
	
	public double circumferance() {
		return perimeter();
	}
	
}
