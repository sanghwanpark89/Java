package ch06_Ex;

public class Ex6_3 {

	public static void main(String[] args) {
		
		System.out.println("Card.with = " +Card.width);
		System.out.println("Card.height = " +Card.height);	//클래스 변수(Static variable)는 객체 생성 없이 클래스이름.클래스 변수 로 직접 사용 가능
		
		//Static variable can be created without creating instance
		
		Card c1 = new Card();
		c1.kind = "Heart";	// 인스터스 변수의 값을 변경한다.
		c1.number = 7;		// 인스턴스 변수의 값을 변경한다.
		//change instance variable
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		//change instance variable
		
		System.out.println("c1 is " + c1.kind + ",  number is " + c1.number + ", size is " + "(" + Card.width + ", " +Card.height + ")" );
		System.out.println("c2 is " + c2.kind + ",  number is " + c2.number + ", size is " + "(" + Card.width + ", " +Card.height + ")" );
		
		System.out.println("change c1 width and c1 height");
		
		c1.width = 50;	// 클래스 변수의 값을 변경한다.
		c1.height = 80; // 클래스 변수의 값을 변경한다. 
		
		  
		
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
