package pkgShape;
import java.io.IOException;

public class Ellipse extends Circle{
	private double ellipseRadius;
	
	public Ellipse(double majorRadius, double minorRadius) throws IOException{
		super(minorRadius);
		this.ellipseRadius = majorRadius;
	}
	
	public Ellipse() {
		
	}

	public double getEllipseRadius() {
		return ellipseRadius;
	}

	public void setRadius(double radius) {
		this.ellipseRadius = radius;
		
		if (radius <= 0) {
			throw new IllegalArgumentException();
		}
	}
	@Override  
	public double perimeter() {
		double radi = super.getCircleRadius();
		return 2 * Math.PI * (Math.sqrt(Math.pow(ellipseRadius, 2) + Math.pow(radi, 2) / 2));
	}
	
	 public double circumferance() {
		 return perimeter();
	 }
	 
	 @Override
	 public double area() {
		 double radi = super.getCircleRadius();
		 return Math.PI * radi * this.ellipseRadius;
	 }
	 public boolean isCircle() {
		 boolean isTrue = ellipseRadius == this.getCircleRadius();
		 return isTrue;
	 }
}