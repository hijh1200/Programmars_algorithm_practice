package Programmars_algorithm_practice.Level_1;

import java.util.Arrays;
public class Placing_Strings_in_Descending_Order {
	public static String solution(String s) {
		 	char[] sol = s.toCharArray();
		    Arrays.sort(sol);
		    return new StringBuilder(new String(sol)).reverse().toString();
	}
	public static void main(String[] args) {
		String s = "Zbcdefg";
		System.out.println(solution(s));
	}

}
