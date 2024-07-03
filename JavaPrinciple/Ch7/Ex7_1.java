package ch7;

class Tv{
	
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
	
}

class SmartTv extends Tv{
	
	boolean caption;
	void displayCaption(String text) {
		if(caption) {	//Captino 상태가 on일때만 text를 출력한다.
			System.out.println(text);
		}
	}
	
}


public class Ex7_1 {

	public static void main(String[] args) {
		
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		
		stv.displayCaption("Hello, World");
		stv.caption = true;	//캡션 기능을 켠다
		stv.displayCaption("Hello, World");

	}

}
