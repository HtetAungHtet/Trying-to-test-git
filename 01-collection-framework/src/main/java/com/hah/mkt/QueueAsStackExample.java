package com.hah.mkt;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueAsStackExample {

	public static boolean check(String str) {
		char [] array = str.toCharArray();
		Deque<Character> stack = new ArrayDeque<Character>();
		
		for (char c : array) {
			
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
				continue;
			}
			
			if (stack.isEmpty()) {
				return false;
			}
			
			char open = stack.pop();
			
			if ((open == '(' && c != ')') 
					|| (open == '{' && c != '}') 
					|| (open == '[' && c != ']' )) {
				return false;
			}
		}
		
		return stack.isEmpty();
	}
}
