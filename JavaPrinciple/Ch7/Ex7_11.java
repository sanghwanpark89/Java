package ch7;

abstract class Player{	//abstract class(incomplete class, incomplete blueprint)
	abstract void play(int pos);	//
	abstract void stop();
}

class AudioPlayer extends Player{
	void play(int pos) {
		System.out.println("It will play from " + pos);
	}
	
	void stop() {
		System.out.println("Stop the player");
	}
}

public class Ex7_11 {

	public static void main(String[] args) {
		
		//Player p = new Player();
		//We cannot make the new instance from abstract class
		
		AudioPlayer ap = new AudioPlayer();
		
		ap.play(100);
		ap.stop();

	}

}
