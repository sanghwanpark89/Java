package ch07_Ex;

class Point{
	int x;
	int y;
}

class Circle{
	Point p = new Point();
	int r;
}

public class InheritanceTest {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.p.x = 3;
		c.p.y= 4;
		c.r = 5;
		
		System.out.println("c.p.x = " + c.p.x);
		System.out.println("c.p.x = " + c.p.y);
		System.out.println("c.p.x = " + c.r);

	}

}
