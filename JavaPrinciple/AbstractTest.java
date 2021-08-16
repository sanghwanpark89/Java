package ch7;

abstract class Player{ // abstract class
	
	abstract void play(int pos); //abstract method
	abstract void stop(); //abstract method
}

//Abstract class can create the instance through the inheritance
class AudioPlayer extends Player{
	void play(int pos){
		System.out.println(+pos + "will be started from" +pos);
	}
	
	void stop(){
		System.out.println("This system will stop");
	}	
}

public class AbstractTest {

	public static void main(String[] args) {
		
		//Player p = new Player(); Abstract class can not be instace without inheritance
		AudioPlayer ap = new AudioPlayer();
		//if Abstract class is inheritanced, it can do polymorphism
		Player ap2 = new AudioPlayer();
		//send 100 to audioplayer play method.
		ap.play(100);
		ap.stop();
		
	}

}
