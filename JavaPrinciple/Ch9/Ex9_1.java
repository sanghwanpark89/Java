package ch09_Ex;

public class Ex9_1 {

	public static void main(String[] args) {
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("v1 is equal to v2");
		}
		else {
			System.out.println("v1 is different with v2");
		}
		
		

	}

}

class Value{
	int value;
	
	Value(int value){
		this.value = value;
	}
}
