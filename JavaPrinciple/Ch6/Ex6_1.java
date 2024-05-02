package ch06_Ex;

public class Ex6_1 {

	public static void main(String[] args) {
		
		Tv t = new Tv()	// create tv instance
		
		t.channel = 7;	// assign number 7 tv.channel
		t.channelDown();	//call channelDown() method
		System.out.println("Current channel is " + t.channel);	//it will print number 7

	}

}


class Tv{
	//TV속성
	
	String color;	//색상, color
	boolean power; 	//전원상태(on/off)
	int channel;	//채널, channel
	
	//TV의 기능(메서드 ) 
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
	
}
