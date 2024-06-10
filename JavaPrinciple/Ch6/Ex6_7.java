package ch06_Ex;


class Data2{
	int x;
}

public class Ex6_7 {

	public static void main(String[] args) {
		
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() x: " + d.x);
		
		change(d);
		

	}
	
	static void change(Data2 d) {	//참조형 매개 변수
		d.x = 1000;
		System.out.println("change : x " + d.x);
	}

}
