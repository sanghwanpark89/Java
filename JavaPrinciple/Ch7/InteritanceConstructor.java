package ch7;

//모든 생성자는 첫줄에 다른 생성자를 호출해야 한다.
//super

class PointTwo{
	int x;
	int y;
	
	PointTwo(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "X = " + x + " Y = " + y; 
	}
}

class Point3DTwo extends PointTwo{
	int z;
	
	Point3DTwo(int x, int y, int z) {
		this.x = x;
		this.y = y;
		//super(x,y);
		this.z = z;
	}
	
	String getLocation() {
		return "X = " + x + ", Y = " + y + ", Z = " + z; 
	}
}

public class InteritanceConstructor {

	public static void main(String[] args) {
		
		Point3DTwo p3 = new Point3DTwo(1,2,3);
		System.out.println(p3);
		System.out.println(p3.getLocation());

	}

}
