package ch07_Ex;

public class Ex7_10 {

	public static void main(String[] args) {
		//Unit u = new Unit();
		Unit[] u = new Unit[3];
		
		u[0] = new Marine();
		u[1] = new Tank();
		u[2] = new Dropship();
		
		for(int i = 0; i < u.length; i++) {
			u[i].move(100, 200);
		}
	}

}

abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		
	}
}

class Marine extends Unit{
	void move(int x, int y) {
		System.out.println("Marine [x=" + x + ", y=" + y +"]");
	}
	void stimPack() {
		
	}
}

class Tank extends Unit{
	void move(int x, int y) {
		System.out.println("Tank [x=" + x + ", y=" + y +"]");
	}
	void changeMode() {
		
	}
}

class Dropship extends Unit{
	void move(int x, int y) {
		System.out.println("Dropship [x=" + x + ", y=" + y +"]");
	}
	void load() {
		
	}
	void unload() {
		
	}
}
