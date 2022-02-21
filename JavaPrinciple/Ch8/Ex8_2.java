package Ch8;

/*
 * if there is error, this code will go through the catch statement
 * if not, this code will skip the catch statement
 * 
 * This example will have the ArithmeticException error since first code in try statement is divided by 0
 * 
 */

public class Ex8_2 {

	public static void main(String[] args) {
		
		System.out.println(1);
		try {
			System.out.println(0/0);
			System.out.println(2);
		}
		catch(Exception e) {
			System.out.println(3);
		}
		System.out.println(4);
	}

}
