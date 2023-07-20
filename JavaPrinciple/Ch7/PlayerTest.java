package ch07_Ex;

abstract class Player{
	
	abstract void play(int pos);
	abstract void stop();
}

class AudioPlayer extends Player{
	void play(int pos) {
		System.out.println("start from " + pos);
	}
	
	void stop() {
		System.out.println("Stop player");
	}
}

public class PlayerTest {

	public static void main(String[] args) {
		
		//Player p = new Player();	//abstract instance cannot be instance
		AudioPlayer ap = new AudioPlayer();
		ap.play(100);
		ap.stop();
		
		Player p = new AudioPlayer();
		p.play(200);
		p.stop();

	}

}
