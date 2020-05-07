package HackerEarth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle extends Polygon 
{
	private static List<Double> side= new ArrayList<Double>();
	
	
	public Triangle(Double side1,Double side2,Double side3) 
	{
		//TODO
		super(side);
		//side = new ArrayList<Double>();
		side.add(side1);
		side.add(side2);
		side.add(side3);
		
	}
	
	
	public List<Double> getMe()
	{
		return side;
	}

	
	@Override
	public double getArea() 
	{
		List<Double> gotten= getSides();
		double s1=gotten.get(0);
		double s2=gotten.get(1);
		double s3=gotten.get(2);
		
		double s = (s1+s2+s3)/2;
		s = s*(s-s1)*(s-s2)*(s-s3);
		double area = Math.sqrt(s);
		
		return area;
	}

	@Override
	public double getPerimeter() {
		List<Double> gotten= getSides();
		double s1=gotten.get(0);
		double s2=gotten.get(1);
		double s3=gotten.get(2);
		
		double perimeter = s1+s2+s3;
		
		return perimeter;
	}


}