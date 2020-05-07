package HackerEarth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Square extends Polygon
{
	private static List<Double> side = new ArrayList<Double>();
	
	public Square(Double side1) 
	{		
		super(side);
		//side = new ArrayList<Double>();
		side.add(side1);
	}
	
	
	public List<Double> getMe()
	{
		return side;
	}
	
	
	
	public double getArea()
	{
		List<Double> gotten= getSides();
		double s1=gotten.get(0);
		
		double area = s1*s1;
		return area;
	}
	
	
	
	public double getPerimeter()
	{
		List<Double> gotten= getSides();
		double s1=gotten.get(0);
		
		double perimeter = s1*4;
		return perimeter;
	}

}
