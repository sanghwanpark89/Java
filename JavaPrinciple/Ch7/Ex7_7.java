package ch07_Ex;

public class Ex7_7 {

	public static void main(String[] args) {
		
		Car c = new Car();
		FireEngine fe = new FireEngine();
		FireEngine fe2 = new FireEngine();
		
		fe.water();
		c = (Car)fe;
		c.drive();
		
		c = fe;
		fe2 = (FireEngine)c;
		fe2.water();
		
	}

}

class Car{
	
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, vroom");
	}
	
	void stop() {
		System.out.println("stop");
	}
}

class FireEngine extends Car{
	
	void water() {
		System.out.println("water!");
	}
	
}
