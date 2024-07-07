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

// 처럼 클래스 자신에 선언된 변수는 자신의 생성자가 초기화를 책임지도록 작성하는 것이 좋다. 참고로 생성자는 상속되지 않는다.
