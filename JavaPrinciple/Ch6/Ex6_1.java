package ch06_Ex;

public class Ex6_1 {

	public static void main(String[] args) {
		
		Tv t = new Tv();
		
		t.channel = 7;
		t.channelDown();
		System.out.println("Current channel is " + t.channel);

	}

}


class Tv{
	//TV속성
	
	String color;	//색상 
	boolean power; 	//전원상태(on/off)
	int channel;	//채널 
	
	//TV의 기능(메서드 ) 
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
	
}
