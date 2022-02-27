package Programmars_algorithm_practice.Level_2;

import java.util.Stack;

public class correct_parenthesis {
	public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.add(s.charAt(i));
            } else {
                if(stack.isEmpty() || stack.peek() == ')') return false;
                stack.pop();
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
	public static void main(String[] args) {
		System.out.println(solution("()()"));
	}

}
