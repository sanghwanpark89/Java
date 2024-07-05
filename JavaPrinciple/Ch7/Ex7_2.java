package ch7;

public class Ex7_2 {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.method();

	}

}

class Parent{
	int x = 10;
}

class Child extends Parent{
	int x = 20;	//기존의 10이 었던 값이 바뀐다.
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x= " + super.x);	//부모값을 받는다.
	}
}
