package ch06_Ex;

public class Ex6_13 {

	public static void main(String[] args) {
		
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue"); 
		
		System.out.println("color of c1 = " +  c1.color + ", gearType of c1 = " + c1.gearType + ", door of c1 = " + c1.door);
		System.out.println("color of c2 = " +  c2.color + ", gearType of c2 = " + c2.gearType + ", door of c2 = " + c2.door);

	}

}


class Car2{
	
	String color;
	String gearType;
	int door;
	
	Car2(){
		this("white", "auto", 4);
	}
	
	Car2(String color){
		this(color, "auto", 4);
	}
	
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
}
