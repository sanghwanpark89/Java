package ch6;

class Data3{
	
	int x;
	
}

public class Ex6_8 {

	public static void main(String[] args) {
		
		Data3 d = new Data3();
		
		//Create the Data3 Instance and the address will be saved into variable d
		
		d.x = 10;
		
		//the variable d will have address, and variable x will have value 10.
		
		Data3 d2 = copy(d);
		
		//copy method will be called on the call stack
		
		//See the below number
		
		//the d data which is address will be sent to as parameter into 
		
		System.out.println("d.x = " + d.x);
		
		System.out.println(d2);
		
		System.out.println("d2.x = " + d2.x);
	}
	
	static Data3 copy(Data3 d) {
		
		//1. copy method will be called.
		
		//2. variable d will be created on the call stack.		
		
		Data3 tmp = new Data3();
		
		//3. variable tmp will have the address
		
		tmp.x = d.x;
		
		return tmp;
	}
}

