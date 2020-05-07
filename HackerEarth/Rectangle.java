package HackerEarth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rectangle extends Polygon {
	
	
	private static List<Double> side = new ArrayList<Double>();;
	//List<Double> sides;
	
	public Rectangle(Double side1,Double side2) {
		//TODO
		super(side);
		//side = new ArrayList<Double>();
		side.add(side1);
		side.add(side2);
		//super(sides);
	}
	
	
	public List<Double> getMe()
	{
		return side;
	}
	
	
	
	
	public double getArea()
	{

		List<Double> gotten= super.getSides();
		double s1=gotten.get(0);
		double s2=gotten.get(1);
		
		double area = s1*s2;
		return area;
	}
	
	
	
	
	public double getPerimeter()
	{
		List<Double> gotten= getSides();
		double s1=gotten.get(0);
		double s2=gotten.get(1);
		
		double perimeter = 2* (s1+s2);
		return perimeter;
	}
	

}
