package ch07_Ex;

class Point2{
	
	int x;
	int y;
	
}

class Circle2{
	Point2 p;// = new Point2();
	int r;
	
	Circle2(){
		p = new Point2();
	}
	
	
}

public class InheritanceTest2 {

	public static void main(String[] args) {
		
		Circle2 c2 = new Circle2();
		System.out.println(c2);
		System.out.println(c2.toString());

	}

}
