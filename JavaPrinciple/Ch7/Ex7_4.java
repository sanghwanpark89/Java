package ch07_Ex;

public class Ex7_4 {

	public static void main(String[] args) {
		
		Point3D p3 = new Point3D(1,2,3);
		System.out.println("p3.x = " +p3.x + ", p3.y = " + p3.y + ", p3.z = " + p3.z);

	}

}

class Point4{
	int x;
	int y;
	
	Point4(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point4{
	int z;
	
	Point3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
}
