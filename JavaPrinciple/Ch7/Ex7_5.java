package ch7;

class Parent{
	int x = 10;	// super.x
}

class Child extends Parent{
	
	//int x = 20;	//this.x
	
	/*
	 * If there is no local variable in child class, the variable in parent class will be this.x
	 */
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}


public class Ex7_5 {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.method();

	}

}
