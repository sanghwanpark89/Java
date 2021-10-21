package ch7;

class Point{	// Point class
	int x;
	int y;
}

class Circle extends Point{	//	This class will inherit the Point class
	int r;					//	This class will have 3 member(2 members are from Point class and 1 member is from Point class)
}


public class Ex7_2 {

	public static void main(String[] args) {
		
		Circle c = new Circle();	//	Create the circle instance
		
		c.x = 3;	// x is 3
		c.y = 4;	// y is 4
		c.r = 5;	// r is 5
		
		System.out.println("c.x = " + c.x);
		System.out.println("c.y = " + c.y);
		System.out.println("c.r = " + c.r);
	}

}
