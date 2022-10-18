package pkgShape;
import java.io.IOException;

public class Ellipsoid extends Ellipse{
	private double radius;
	
	public Ellipsoid() {
		
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException();
		}
		this.radius = radius;
	}
	
	public Ellipsoid(double majorRadius, double radius ,double minorRadius) throws IOException{
		super(majorRadius, minorRadius);
		this.setRadius(radius);
	}
	
	public double volume() {
		return (4 * Math.PI * radius * super.getCircleRadius() * super.getEllipseRadius()) / 3 ;
	}
	
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public double area() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public double circumferance() {
		return perimeter();
	}
	
	public boolean isSphere() {
		return super.getCircleRadius() == super.getEllipseRadius() && super.getEllipseRadius() == radius;
	}
}

