package ch7;

import java.util.*;

class Product{	//Product class
	
	int price;	//product price
	int bonusPoint;	//product bonus point
	
	Product(int price){	//Constructor of Parent class
		this.price = price;	
		this.bonusPoint = (int)(price/10.0);
	}
}

class Tv1 extends Product{	//Class of Tv1 which is class of Product
	
	Tv1(){	//Tv1 constructor
		super(100);	//call constructor of product
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product{	//Class of Computer which is class of Product
	
	Computer(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer{
	
	int money;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.print("You Select " + p);
			System.out.println(", and Money Shortage, so it is declined");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println("You bought the " + p);
	}
}

public class Ex7_9 {

	public static void main(String[] args) {
		
		System.out.println("What is your budget?");
		//Ask to user to enter the budget
		
		Scanner myScan = new Scanner(System.in);
		//Create scananer
		
		int money = myScan.nextInt();
		//user's budget will be deposit to here
		
		Buyer b = new Buyer();
		//Create buyer instance
		
		b.money = money;
		//save the user's money to b.money
		
		b.buy(new Tv1());
		//put Tv1 instance to buy method in Buyer class
		
		b.buy(new Computer());
		//put Computer instance to buy method in Buyer class
		
		System.out.println("Your current money is " + b.money);
		//
		
		System.out.println("Your bonus point is " + b.bonusPoint);
		
		myScan.close();
	}

}

package ch07_Ex;


class Product2{
	int price;
	int bonusPoint;
	
	Product2(int price){
		this.price = price;
		bonusPoint = (int) (price/10.0);
	}
	Product2(){
		
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


public class Ex7_9 {

	public static void main(String[] args) {
		
		int money = 1000;
		int bonusPoint = 0;
		Product2[] cart = new Product2[10];
		int i = 0;
		
		void buy2(Product2 p) {
			if(money < p.price) {
				System.out.println("decline");
			}
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p + "bought");

	}

}
