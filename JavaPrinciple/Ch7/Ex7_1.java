package ch7;

class Tv{
	
	boolean power;	//status of power (on/off)
	
	int channel;	//channel
	
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

class SmartTv extends Tv{	// SmartTV has caption function. 
	
	boolean caption;	//	Caption on/off
	//	default value is false.
	
	void displayCaption(String text) {
		if(caption) {	// if status of caption is true, it will show caption
			System.out.println(text);
		}
	}
}

public class Ex7_1 {

	public static void main(String[] args) {
		
		SmartTv stv = new SmartTv();
		
		stv.channel = 10;      //	member From Parent
		stv.channelUp();       //	member From parent
		stv.channelDown();     //	member From parent
		stv.channelDown();     //	member From parent

		
		System.out.println(stv.channel);
		// 9
		
		stv.caption = true;
		System.out.println(stv.caption);
		//true
		
		stv.displayCaption("Hello World through method");
		//hello world through method

		stv.displayCaption("Hello World");
		//hello world
	}

}
