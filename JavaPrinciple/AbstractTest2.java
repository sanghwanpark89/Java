package ch7;


abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	
	void stop(/*the units will stop at the specific point from move method*/){}
}

class Marine extends Unit{
	void move(int x, int y){
		System.out.println("This will move [" + x + " , " + y + "]");
	}
	void stimpack(){
		
	}
}

class Tank extends Unit{
	void move(int x, int y){
		System.out.println("This will move [" + x + " , " + y + "]");
	}
	void changeMode(){
		
	}
}

class Dropship extends Unit{
	void move(int x, int y){
		System.out.println("This will move [" + x + " , " + y + "]");
	}
	
	void load(){
		
	}
	void unload(){
		
	}
}

public class AbstractTest2 {

	public static void main(String[] args) {
		
		//Unit group = new Unit();// Since Unit is abstract class, it is not allowed to do as inatance
		
		Unit[] group = new Unit[3];//Unit array
		
		group[0] = new Marine();
		
		group[1] = new Tank();
		
		group[2] = new Dropship();
		
		group[0].move(10, 10);
		group[1].move(44, 21);
		group[2].move(90, 100);
	}

}

