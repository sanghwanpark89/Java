package ch06_Ex;

class Data3{
	int x;
}

public class Ex6_8 {

	public static void main(String[] args) {
		
		Data3 d = new Data3();
		//Create the Data3 instance
		//variable d point to Data3 instance
		
		d.x = 10;
		//variable d.x will have value 10
		
		Data3 d2 = copy(d);
		//variable d2 will be created first then call copy method.
		System.out.println("d.x = " + d.x);
		//print 10
		System.out.println("d2.x = " + d2.x);
		//print 10

	}
	
	static Data3 copy(Data3 d) {
		//copy method will return address
		Data3 tmp = new Data3();
		//create variable tmp which is data3 data type
		tmp.x = d.x;
		//copy d.x value to tmp.x
		return tmp;
		//return address
	}

}

