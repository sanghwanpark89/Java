package ch06_Ex;

public class Ex6_12 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white", "auto", 4);
		
		System.out.println("color of c1 = " +  c1.color + "gearType of c1 = " + c1.gearType + "door of c1 = " + c1.door);
		System.out.println("color of c2 = " +  c2.color + "gearType of c2 = " + c2.gearType + "door of c2 = " + c2.door);
	}

}

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		
	}
	
	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
}
