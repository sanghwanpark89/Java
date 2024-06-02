package ch06_Ex;

// public class Ex6_2 {

// 	public static void main(String[] args) {
		
// 		Tv t = new Tv();
		
// 		t.channel = 7;
// 		t.channelDown();
// 		t.channelDown();
// 		t.channelUp();
		
// 		System.out.println("Current channel is " + t.channel);
		
// 		Tv t2 = new Tv();
// 		t2.channel = 10;
// 		t2.channelUp();
// 		t2.channelUp();
		
// 		System.out.println("Current channel is "  + t2.channel);
		
		

// 	}

// }

public class Ex6_2{

	public static void main(String[] arts){

		Tv t1 = new Tv();
		Tv t2 = new Tv();

		System.out.println("Value of T1 is " + t1.channel);
		System.out.println("Value of T2 is " + t2.channel);

		t1.channel = 7;
		System.out.println("Value of T1 has been changed to 7");

		System.out.println("Value of T1 is " + t1.channel);	//7
		System.out.println("Value of T2 is " + t2.channel);	//0
		
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
