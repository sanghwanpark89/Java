package ch7;

abstract class Unit2{
	int x; // x, y in the map
	int y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("STOP");
	}
}

interface Fightable{//All interface methods will have public abstract access modifier without exception
	void move(int x, int y);//public abstract is omitted
	void attack(Fightable f);//public abstract is omitted
}

class Fighter extends Unit2 implements Fightable{
	
	public void move(int x, int y) {
		System.out.println("move to" + "[" + x + "," + y+"]");
	}
	
	public void attack(Fightable f) {
		System.out.println("Attack" + f);
	}
	
	Fightable getFightable() {	//if the return type is interface, it will return the object which is inherited interface
		Fightable f = new Fighter();
		//parent          Child
		return f;
		//convert child to parent does not need casting
	}
}

public class Ex7_13 {

	public static void main(String[] args) {
		
		Fighter f = new Fighter();
		f.move(100,200);
		Fighter f2 = new Fighter();
		f.attack(new Fighter());
		
		Fightable f3 = f.getFightable();
		
		System.out.println(f3);
		
	}

}
