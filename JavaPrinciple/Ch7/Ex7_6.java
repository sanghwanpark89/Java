package ch7;

class Point4{
	int x;	//	variable x
	int y;	//	variable y
		
	Point4(int x, int y){	//	Point4 Constructor will initialize the variable
		
		this.x = x;
		
		this.y = y;
	}
	
	String getLocation() {	//	getLocaton method will return string with x and y value
		return "x: " + x + ", y: " +y;
	}
}

class Point3D extends Point4{
	
	int r;
	
	Point3D(int x, int y, int r){
		super(x,y);	//	Key Word super will call Point4 constructor then initialize the variable
		this.r = r;	//	r is variable in r
	}
	
	String getlocation() {	//	This keyword will return string
		return "x: " + x + " y: " + y + " r: " +r;
	}
}



public class Ex7_6 {

	public static void main(String[] args) {
		
		Point3D p3 = new Point3D(1,2,3);	//	Create instance and initialize the variables as shown
		
		System.out.println(p3);
		
		System.out.println(p3.getlocation());

	}

}
