package ch7;

public class Ex7_8 {

	public static void main(String[] args) {
		
		Car c = new Car();// Car instance
		
		FireEngine fe = new FireEngine();//FireEngine instance
		
		FireEngine fe2 = (FireEngine) c;	// c is the address of car instance
		
		Car c1 = new FireEngine();
		//c1.water(); c1 cannot access water() method
		
		fe2.stop();
		
		fe.stop();
	}

}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("DRIVE function!!!");
	}
	
	void stop() {
		System.out.println("STOP function!!!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("Water function!!!");
	}
}