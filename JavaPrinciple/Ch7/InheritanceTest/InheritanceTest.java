package ch7;

class Point{
	int x;
	int y;
}

//	below code is about the extends

//	class Circle extends Point{
//		int r;
//	}

class Circle{
	
	Point p = new Point();
	int r;
}


public class InheritanceTest {

	public static void main(String[] args) {
		
		//below code is for inherance
//		Circle c = new Circle();
//		c.x = 1;
//		c.y = 2;
//		c.r = 3;
//		
//		System.out.println("c.x = " + c.x);
//		System.out.println("c.y = " + c.y);
//		System.out.println("c.r = " + c.r);
		
		//below code is for composite
		
		Circle c =  new Circle();
		
		System.out.println(c);
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;		
		

	}

}
