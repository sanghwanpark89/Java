package Ch12;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		
		//ArrayList list = new ArrayList(); we need to use this before JDK 1.5 version
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(10);
		myList.add(20);
		myList.add(30);
		
		//myList.add("30"); this will occurred the error since ArrayList type is Integer
		
		Integer myNum = myList.get(0);
		
		System.out.println(myNum);

	}

}
