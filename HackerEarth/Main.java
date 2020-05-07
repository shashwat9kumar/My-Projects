package HackerEarth;

public class Main {

	public static void main(String[] args)
	{
		Polygon r = new Rectangle(10.2,11.4);
		Polygon s = new Square(10.2);
		Polygon t = new Triangle(10.2,11.4,12.6);
		
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());
		
		System.out.println();
		
		System.out.println(s.getArea());
		System.out.println(s.getPerimeter());
		
		System.out.println();
		
		System.out.println(t.getArea());
		System.out.println(t.getPerimeter());
	}

}
