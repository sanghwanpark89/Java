package ch06_Ex;

public class Ex6_10 {

	public static void main(String[] args) {
		
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3,3) result:" + mm.add(3,3));
		System.out.println("mm.add(3,3) result:" + mm.add(3,3L));
		System.out.println("mm.add(3,3) result:" + mm.add(3L,3));
		System.out.println("mm.add(3,3) result:" + mm.add(3L,3L));
	}
}

class MyMath3{
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a+b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a+b;
	}
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
}
