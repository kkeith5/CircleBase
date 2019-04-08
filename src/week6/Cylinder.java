package week6;

public class Cylinder extends circleBase implements Comparable<Cylinder>{
	
	private int height;
	
	//constructors
	public Cylinder() {
		 radius = 1;
		 height = 1;
		}
		
	public Cylinder(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	//methods
	
	//public double volume() {
		//System.out.println(radius);
		//return (3.14*(radius*radius))*height;
		//}
	

	@Override
	public double surfaceArea() {
		
		int radiusSquared = radius * radius; 
	    double surfaceArea = 2 * 3.14 * radius * height + 2 * 3.14 * radiusSquared; 
	    return surfaceArea;
		
	}

	@Override
	public int compareTo(Cylinder c) {
		if(this.volume()> c.volume()){
			return 1;
		}
		if(this.volume()< c.volume()){
			return -1;
	}
		return 0;
	}
	
	
	public int compareTo(Cone c) {
		if(this.volume()> c.volume()){
			return 1 ;
		}
		else if(this.volume()< c.volume()){
			return -1;
	}
		return 0;
		
	}
	
	

	@Override
	public double volume() {
		 int radiusSquared = radius * radius; 
		 double volume = 3.14 * radiusSquared * height; 
		 return volume; 
	}

	
}
