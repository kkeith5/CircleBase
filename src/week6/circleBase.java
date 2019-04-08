package week6;

public abstract class circleBase {
	private String color;
	protected int radius;
	
	//constructors
	public circleBase() {	
		radius = 1;
	}
	
	public circleBase(int radiuss) {	
		radius = radiuss;
	}
	
	//getters and setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public abstract double surfaceArea();
    public abstract double volume();
}
