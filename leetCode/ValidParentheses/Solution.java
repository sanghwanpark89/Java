package ValidParentheses;

import java.util.*;

public class Solution {
	
	public boolean isValid(String s) {
		
		Stack<Character> myStack = new Stack<Character>();
		//Make the stack 
		
		for(char c: s.toCharArray()) {
		//for loop will be executed 
			if(c == '(') {
			//if character is equal to (
				myStack.push(')');
				//push the ')' into the stack
			}
			else if(c == '{') {
			//else if character is equal to {
				myStack.push('}');
				//push the '}' into the stack
			}
			else if(c == '[') {
			//else if character is equal to '['
				myStack.push(']');
				//push the ']' into the stack
			}
			else if(myStack.isEmpty() || myStack.pop() != c) {
			//else if stack is empty or element into the stack will be popped up and compare with c.
			//if pop up element is not equal to c, it will return false
				return false;
			}
		}
		return myStack.isEmpty();
		//if stack is empty, it will return true;
	}
}
