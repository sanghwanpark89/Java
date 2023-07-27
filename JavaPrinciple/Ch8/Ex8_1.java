package Ch8;

/*
 * if there is error, this code will go through the catch statement
 * if not, this code will skip the catch statement
 */

public class Ex8_1 {

	public static void main(String[] args) {
		
		System.out.println(1);
		
		try { //try catch statement will need 
			System.out.println(2);
			System.out.println(2);
		}
		catch(Exception e){
			System.out.println(4);

		}
		//end of the try-catch statement
		System.out.println(5);
	}
}
