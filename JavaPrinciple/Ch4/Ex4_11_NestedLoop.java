package Ch4;

public class Ex4_11_NestedLoop {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Triangle Starts");
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
			//System.out.println(i);
		}

	}

}
