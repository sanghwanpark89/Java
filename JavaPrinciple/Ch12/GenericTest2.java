package Ch12;

import java.util.ArrayList;

class Tv1{
	
}

class Audio1{
	
}


public class GenericTest2 {

	public static void main(String[] args) {
		
		ArrayList<Tv1> myTvList = new ArrayList<Tv1>();	//Only Tv1 instance can be store in myTvList
		
		myTvList.add(new Tv1());
		
		//Tv1 t2 = (Tv1)myTvList.get(0);
		//Before JDK 1.5, we need to cast to Tv1 since get method will return Object type.
		
		Tv1 t = myTvList.get(0);
		
		System.out.println(t);
		//System.out.println(t2);
		
	}

}
