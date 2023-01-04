package ch9;

public class Ex9_2 {

	public static void main(String[] args) {
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("v1 is equals to v2");
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
	
	public boolean equals(Object obj) {
		//return this == obj;  //it will compare addresses
		
		if(obj instanceof Value) {
			
			Value v = (Value)obj;
			
			return this.value == v.value;
		}
		else {
			return false;
		}
		
	}
}
