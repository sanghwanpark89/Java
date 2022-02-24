package Ch12;

import java.util.*;

class Product{
	
}

class Tv extends Product{
	
}

class Audio extends Product{
	
}

public class Ex12_1 {

	public static void main(String[] args) {
		
		ArrayList<Product> myProductList = new ArrayList<Product>();
		ArrayList<Tv> myTvList = new ArrayList<Tv>();
		
//		ArrayList<Product> tvList = new ArrayList<Tv>();	Error
//		
//		List<Tv> tvList = new ArrayList<Tv>();	OK polymorphism 다형성 
		
		myProductList.add(new Tv());	//public boolean add(Product e) 
		//new Tv() instance which is child of product can be added to myProductList
		
		myProductList.add(new Audio());
		
		myTvList.add(new Tv());
		myTvList.add(new Tv());
		
		printAll(myProductList);
//		printAll(tvList);

	}
	
	public static void printAll(ArrayList<Product> list) {
		
		for(Product p: list) {
			System.out.println(p);
		}
		
	}

}
