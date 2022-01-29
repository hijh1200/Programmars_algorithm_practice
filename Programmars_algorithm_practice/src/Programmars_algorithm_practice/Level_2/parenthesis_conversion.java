package Programmars_algorithm_practice.Level_2;

import java.util.Stack;

public class parenthesis_conversion {
	public static Stack<Character> stack = new Stack<Character>();
	public static String divide(String p) {
		if(p.equals("")) return "";
		
		int i = 0;
		stack.push(p.charAt(i));
		while(!stack.isEmpty()) {
			i++;
			if(stack.peek() != p.charAt(i)) stack.pop();
			else stack.push(p.charAt(i));
		}
		String u = p.substring(0, i+1);
		String v = p.substring(i+1, p.length());
		
		if(isRight(u)) {
			return u + divide(v);
		}
		else {
			String temp = u.substring(1, u.length()-1);
			temp = temp.replaceAll("\\(", ".").replaceAll("\\)", "\\(").replaceAll("\\.", ")");
			return "(" + divide(v) + ")" + temp;
		}
	}
	
	public static boolean isRight(String u) {
		int cnt = 0;
		for(int i=0; i<u.length(); i++) {
			if(u.charAt(i) == '(') cnt++;
			else cnt--;
			
			if(cnt < 0) return false;
		}
		if(cnt == 0) return true;
		return false;
	}
	
	public static String solution(String p) {
		return divide(p);
	}
	public static void main(String[] args) {
		String p = "()))((()";
		System.out.println(solution(p));
	}

}
