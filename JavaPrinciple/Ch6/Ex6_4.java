package ch06_Ex;

import java.util.*;
import java.sql.*;

public class Ex6_4 {

	public static void main(String[] args) {
		
		MyMath mm = new MyMath();
		
		long result1 = mm.add(5L, 3L);
		
		long result2 = mm.substract(5L, 3L);
		
		long result3 = mm.multiply(5L, 3L);
		
		long result4 = mm.divide(5L, 3L);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		
	}

}

class MyMath{
	
	//long beforeTime;
	//long afterTime;
		
	long add(long a, long b) {
		return a + b;
	}
	
	long substract(long a, long b) {
		return a-b;
	}
	
	long multiply(long a, long b) {
		return a * b;
	}
	
	long divide(long a, long b) {
		return a/b;
	}
	
	long beforeTime = System.currentTimeMillis();
	
	long max(long a, long b) {
		return a>b ? a: b;
	}
	
	long afterTime = System.currentTimeMillis();
	System.out.println();
	System.out.println(secDiffTime);

	
	
	long min(long a, long b) {
		return a>b ? b: a;
	}
	
	long max2(long a, long b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	
}
