package Ch12;

import java.util.*;

class Student{
	
	String studentName = "";
	int classNumber;
	int studentNumber;
	
	public Student(String studentName, int classNumber, int studentNumber) {
		this.studentName = studentName;
		this.classNumber = classNumber;
		this.studentNumber = studentNumber;
	}
}

public class Ex12_2 {

	public static void main(String[] args) {
		
		ArrayList<Student> myList = new ArrayList<Student>();
		
		myList.add(new Student("JavaKing", 1, 1));
		myList.add(new Student("JavaQueen", 1, 2));
		myList.add(new Student("Java", 2, 1));
		
		//myList variable will have address of new Student() instance
		
		Iterator<Student> iterator = myList.iterator();
		
		while(iterator.hasNext()) {
			Student s = iterator.next();
			System.out.println(s.studentName);
		}
		
	}

}
