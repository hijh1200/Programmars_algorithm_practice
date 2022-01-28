package Programmars_algorithm_practice.Level_2;

import java.util.Stack;

public class remove_by_pair {
	public static int solution(String s) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<s.length(); i++) {
			if(stack.empty()) stack.add(s.charAt(i));
			else if(s.charAt(i) == stack.peek()) stack.pop();
			else stack.add(s.charAt(i));
		}
		
		if(stack.empty()) return 1;
		return 0;
	}
	public static void main(String[] args) {
		String s = "abcda";
		System.out.println(solution(s));
	}

}
