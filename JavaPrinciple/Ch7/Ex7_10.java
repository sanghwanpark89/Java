package ch7;

class Product2{
	int price;
	//price of product
	int bonusPoint;
	//bonusPoint 
	Product2(int price){
		this.price = price;
		this.bonusPoint = (int) (price / 10.0);
	}
}

class Tv2 extends Product2{
	
	Tv2(){
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer2 extends Product2{
	
	Computer2(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio2 extends Product2{
	
	Audio2(){
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer2{
	
	int money = 1000;
	
	int bonusPoint = 0;
	
	Product2[] cart = new Product2[10];
	
	int i = 0;
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("Your money is shrot, so it is declined");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println("You bought the " + p);
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i = 0; i < cart.length; i++) {
			if(cart[i] == null)
				break;
			sum += cart[i].price;
			itemList += cart[i] + ",";
		}
		System.out.println("Total is " + sum +  " dollars");
		System.out.println("You bought " + itemList);
	}
}

public class Ex7_10 {

	public static void main(String[] args) {
		
		Buyer2 b = new Buyer2();
		//Create the Buyer2 Object
		//The array of cart will be created
		b.buy(new Tv2());
		//Provide Tv information to buy method
		b.buy(new Computer2());
		//Provide Computer information to buy method
		b.buy(new Audio2());
		//Provide Audio information to buy method
		b.summary();
		//call summary method
		System.out.println("Remaining is " + b.money);
		
	}

}
