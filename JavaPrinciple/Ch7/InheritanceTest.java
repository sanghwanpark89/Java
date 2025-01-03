package ch7;

class Point{
	int x;
	int y;
	//variables of parent class
}

class Circle extends Point{
	int r;
	//variable of child class and extends of parents class
}

public class InheritanceTest {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.x = 1;
		c.y = 2;
		c.r = 3;
		
		System.out.println("c.x = " + c.x);
		System.out.println("c.y = " + c.y);
		System.out.println("c.r = " + c.r);

	}

}
