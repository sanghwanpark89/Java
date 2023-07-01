package ch06_Ex;

public class Ex6_2 {

	public static void main(String[] args) {
		
		Tv t = new Tv();
		
		t.channel = 7;
		t.channelDown();
		t.channelDown();
		t.channelUp();
		
		System.out.println("Current channel is " + t.channel);
		
		Tv t2 = new Tv();
		t2.channel = 10;
		t2.channelUp();
		t2.channelUp();
		
		System.out.println("Current channel is "  + t2.channel);
		
		

	}

}

//class Tv{
//	
//	String color;
//	boolean power;
//	int channel;
//	
//	void power() {	power = !power;	}
//	void channelUp() {	++channel; }
//	void channelDown()	{--channel;	}
//}
