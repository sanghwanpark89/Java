package ch06_Ex;

public class Ex6_6 {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("main() x : " + d.x);
		
		change(d.x);
		System.out.println("After changed(d.x) " + d.x);
		
		System.out.println("maine() : x " + d.x);	//d.x의 값이 변경된 것이 아니라, change method의 매개변수 x의 값이 변경된 것이다. 
								//즉, 원본이 아닌 복사본이 변경된 것이라 원본에는 아무런 영향을 미치지 못한것이다.

	}
	
	static void change(int x) {	//기본현 매개변수
		x=1000;
		System.out.println("change() : x = " + x);
	}

}

class Data{
	int x;
}
