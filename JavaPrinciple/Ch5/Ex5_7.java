package ch5;
import java.util.*;


public class Ex5_7 {

	public static void main(String[] args) {
		
//		String[] stringArray = {"Rock", "Scissor", "Paper"};
//		System.out.println(Arrays.toString(stringArray));
//		
//		for(int i = 0; i < stringArray.length; i++) {
//			int tmp = (int)(Math.random()*3);
//			System.out.println(stringArray[tmp]);
//		}
		
		System.out.println("Number of parameter: " + args.length);
		for(int i = 0; i < args.length; i++) {
			System.out.println("args [  "   +i +  " ]  = \"" + args[i] + "\"");
			
		}
		
	}

}
