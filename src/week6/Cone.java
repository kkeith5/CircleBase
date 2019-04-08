package week6;
import java.util.*;
import java.lang.*;

public class Cone extends circleBase implements Comparable<Cone>{

	private int height;
	
	//constructors
	public Cone() {
		radius = 1;
		height = 1;
	}
	public Cone(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}
	

	public double getRadius() {
		return radius;
		
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	//methods
	@Override
	public double volume() {
		return 1.0 / 3 * (Math.PI * radius * radius * height);
	}

	@Override
	public double surfaceArea() {
		return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
		 
		
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
	
	public int compareTo(Cylinder c) {
		if(this.volume()> c.volume()){
			return 1;
		}
		if(this.volume()< c.volume()){
			return -1;
	}
		return 0;
	}
}
	
