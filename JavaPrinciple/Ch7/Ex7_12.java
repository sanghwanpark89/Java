package ch7;

/*
 * Abstract class is created for common members from other class.
 */

abstract class Unit{
	int x;
	int y;
	abstract void move(int x, int y);//Moving method 
	void stop() {
	}
}

class Marine extends Unit{
	
	void move(int x, int y) {
		super.x = x;
		super.y = y;
		System.out.println("Marine move to [x = " + x + ", y= " + y + "]");
	}
	void stop() {
		System.out.println("Marine stop at [x = " + x + ", y= " + y + "]");
	}
}

class Tank extends Unit{
	void move(int x, int y) {
		super.x = x;
		super.y = y;
		System.out.println("Tank move to [x = " + x + ", y= " + y + "]");
	}
	void changeMode() {
		System.out.println("Tank change mode at [ x= " + x + ", y= " + y + "]");
	}
	void stop() {
		System.out.println("Tank stop at [x = " + x + ", y= " + y + "]");
	}
}

class Dropship extends Unit{
	void move(int x, int y) {
		super.x = x;
		super.y = y;
		System.out.println("Dropship move to [x = " + x + ", y= " + y + "]");
	}
	void load() {
		System.out.println("Dropship load at [x = " + x + ", y= " + y + "]");
	}
	
	void unload() {
		System.out.println("Dropship unload at [x = " + x + ", y= " + y + "]");
	}
	void stop() {
		System.out.println("Dropship stop at [x = " + x + ", y= " + y + "]");
	}
}

public class Ex7_12 {

	public static void main(String[] args) {
		
		Unit[] group = new Unit[3];
		
		group[0] = new Marine(); 
		group[1] = new Tank();
		group[2] = new Dropship();
		
		group[0].move(100,200);
		group[1].move(100,200);
		group[2].move(100,200);
		
		group[0].stop();
		group[1].stop();
		group[2].stop();
		
	}

}
