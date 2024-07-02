package ch6;

public class Ex6_14 {

	static {
		System.out.println("static { }");
	}

	{
		System.out.println("{ }");
	}

	public Ex6_14() {
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Ex6_14 bt = new Ex6_14");
		Ex6_14 bt = new Ex6_14();
		
		System.out.println("Ex6_14 bt2 = new Ex6_14");
		Ex6_14 bt2 = new Ex6_14();
		
	}

}

/**
 * 예제가 실행 되면서 Ex6_14가 메모리에 로딩될 때, 클래스 초기화 블럭이 가장 먼저 수행되어
 * static{}이 화면에 출력된다.
 * 그 다음에 main 메서드가 실행되어 인스턴스가 생성되면서 인스턴스 초기화 블럭이 먼저 수행되고,
 * 끝으로 생생저가 수행된다.
 * 
 * 클래스 초기화 블럭은 처음 메모리에 로딩 될때 한번만 수행 되었지만, 인스턴스 초기화 블럭은 인스턴스가 생성될 때 마다 수행 되었다.
 * 
 */
