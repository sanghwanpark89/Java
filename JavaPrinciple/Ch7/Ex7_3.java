package ch7;

class Point2{
	int x;
	int y;
}

class Circle2{	//	Circle2 class has Point2 class
				//	Composite
	
	Point2 p = new Point2();
	int r;
	
}

public class Ex7_3 {

	public static void main(String[] args) {
		
		Circle2 c = new Circle2();	//	Create the Circle2 instance
		
		c.p.x = 3;	//	if we need to access to variable x in Point2, we need to do c.p.x;
		c.p.y = 4;	//	if we need to access to variable x in Point2, we need to do c.p.y;
		c.r = 5;	//	r variable is from Circle2, so we only need c.r;
		
		System.out.println("c.p.x = " + c.p.x);
		System.out.println("c.p.y = " + c.p.y);
		System.out.println("c.r = " + c.r);
	}

}
