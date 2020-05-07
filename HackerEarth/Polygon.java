package HackerEarth;

import java.util.ArrayList;
import java.util.List;

	public abstract class Polygon {
	private List<Double> sides;
	
	public Polygon(List<Double> sides)
	{
		this.sides=sides;
		sides = this.getMe();
	}
	
	
	public abstract List<Double> getMe();


	public List<Double> getSides() {
		return sides;
	}
	
	
	 
	public abstract double getArea();
	
	public abstract double getPerimeter();

}
