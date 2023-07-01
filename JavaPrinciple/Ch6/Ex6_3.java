package ch06_Ex;

public class Ex6_3 {

	public static void main(String[] args) {
		
		System.out.println("Card.with = " +Card.width);
		System.out.println("Card.height = " +Card.height);
		
		//Static variable can be created without creating instance
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		//change instance variable
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		//change instance variable
		
		System.out.println("c1 is " + c1.kind + ",  number is " + c1.number + ", size is " + "(" + Card.width + ", " +Card.height + ")" );
		System.out.println("c2 is " + c2.kind + ",  number is " + c2.number + ", size is " + "(" + Card.width + ", " +Card.height + ")" );
		
		System.out.println("change c1 width and c1 height");
		
		c1.width = 50;
		c1.height = 80;
		
		  
		
		System.out.println("c1 is " + c1.kind + ",  number is " + c1.number + ", size is " + "(" + Card.width + ", " +Card.height + ")" );
		System.out.println("c2 is " + c2.kind + ",  number is " + c2.number + ", size is " + "(" + Card.width + ", " +Card.height + ")" );


	}

}

class Card{
	String kind;
	int number;
	
	static int width = 100;
	static int height = 250;
	
}
