package Programmars_algorithm_practice.Level_1;

import java.util.LinkedList;
import java.util.Queue;

public class darts_game {
	public static int solution(String dartResult) {
		Queue<String> q = new LinkedList<String>();
		
		int idx = 0;
		for(int i=0; i<dartResult.length()-1; i++) {
			if(Character.isDigit(dartResult.charAt(i+1))) {
				q.add(dartResult.substring(idx, i+1));
				idx = i + 1;
			}
		}
		q.add(dartResult.substring(idx, dartResult.length()));
		
		System.out.println(q);
		
		int sum = 0;
		int prev = 0;
		int now = 0;
		String temp = "";
		
		while(!q.isEmpty()) {
			String str = q.poll();
			if(str.length() == 1) {
				temp = str;
				str = temp + q.poll();
			}
			String point = "";
			String bonus = "";
			String option = "";
			for(int i=0; i<str.length(); i++) {
				if(Character.isDigit(str.charAt(i))) {
					point = point + str.charAt(i);
				}
				else if(Character.isLetter(str.charAt(i))) {
					bonus = bonus + str.charAt(i);
				}
				else {
					option = option + str.charAt(i);
				}
			}
			now = Integer.parseInt(point);
			if(bonus.equals("D")) {now = (int) Math.pow(now, 2);}
			else if(bonus.equals("T")) {now = (int) Math.pow(now, 3);}
			
			if(option.equals("*")) {
				sum = sum + prev + now * 2;
				prev = now * 2;
			}
			else if(option.equals("#")) {
				sum = sum - now;
				prev = now * (-1);
			}
			else {
				sum = sum + now;
				prev = now;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String dartResult = "1S2D*3T";
//		String dartResult = "1D2S#10S";
//		String dartResult = "1D2S0T";
//		String dartResult = "1S*2T*3S";
		System.out.println(solution(dartResult));
	}

}
