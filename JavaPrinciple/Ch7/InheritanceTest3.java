package ch07_Ex;

class Point3{
	int x;
	int y;
	
	Point3(){
		
	}
	
	Point3(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x: " + x + ", y: " + y; 
	}
}

class Circle3{
	Point3 p = new Point3();
	int r;
}

public class InheritanceTest3 {

	public static void main(String[] args) {
		
		Point3 p3 = new Point3(3,5);
		System.out.println(p3);
		System.out.println(p3.toString());
	}

}
