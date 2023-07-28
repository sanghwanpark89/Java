package ch09_Ex;

class Person extends Object{
	
	long id;
	Object obj;
	public boolean equals(Object obj) {
		
		System.out.println(obj instanceof Person);
		if(obj instanceof Person) {
			return id == ((Person)obj).id;
		}
		else {
			return false;
		}
	}
	
	//System.out.println(obj instanceof Person);
	
	Person(long id){
		this.id = id;
	}
}

public class Ex9_2 {

	public static void main(String[] args) {
		
		Person p1 = new Person(8905051234567L);
		Person p2 = new Person(8905051234567L);
		
		if(p1.equals(p2)) {
			System.out.println("p1 and p2 are same");
		}
		
		else {
			System.out.println("p1 and p2 are different");
		}
		

	}

}


