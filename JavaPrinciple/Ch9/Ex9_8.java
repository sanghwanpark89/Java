package ch09_Ex;

public class Ex9_8 {

	public static void main(String[] args) {
		
		char[] cArr = new char[0]; // same with  {}
		String s1 = new String(cArr);  //  same with String s1 = new String(cArr)
		
		System.out.println("cArr.length=" + cArr.length);
		
		System.out.println("@@@" + s1 + "@@@");
		
	}

}
