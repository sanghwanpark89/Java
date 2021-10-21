package ch7;

class Point3{
	int x;	//	variable
	int y;	//	variable
	
	Point3(int x, int y){	//	Point3 Constructor to initialize variable
		this.x = x;
		this.y = y;
	}
	
	public String toString() {	//	toString method will return string 
		return "x: " + x + ", y: " + y;
	}
}

public class Ex7_4 {

	public static void main(String[] args) {
		
		Point3 p = new Point3(3,5);
		System.out.println(p);
	}

}
