package Programmars_algorithm_practice.Level_2;

import java.util.ArrayList;
import java.util.Stack;

public class countries_124 {
	public static String solution(int n) {
		Stack<Integer> stack = new Stack<Integer>();
		while(n != 0) {
			stack.add(n%3);
			n /= 3;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(!stack.empty()) {
			list.add(stack.pop());
		}
		System.out.println(list);
		
		while(list.indexOf(0) != -1) {
			for(int i=1; i<list.size(); i++) {
				
			}
		}
		
		
		
		return "";
	}
	public static void main(String[] args) {
		System.out.println(solution(15));
	}

}
