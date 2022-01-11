package Programmars_algorithm_practice.Level_1;

import java.util.Arrays;
import java.util.HashMap;

public class Sorting_strings_my_own_way {
	public static String[] solution(String[] strings, int n) {
		for(int i=0; i<strings.length; i++) {
			strings[i] = strings[i].substring(n, n+1) + strings[i];
		}
		Arrays.sort(strings);
		for(int i=0; i<strings.length; i++) {
			strings[i] = strings[i].substring(1);
		}
		return strings;
	}
	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		System.out.println(solution(strings, n));
	}

}
