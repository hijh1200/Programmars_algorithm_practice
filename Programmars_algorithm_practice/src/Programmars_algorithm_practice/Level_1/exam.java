package Programmars_algorithm_practice.Level_1;

import java.util.Arrays;
import java.util.ArrayList;

public class exam {
	public static int[] solution(int[] answers) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int cnt_a = 0;
		int cnt_b = 0;
		int cnt_c = 0;
		
		for(int i=0; i<answers.length; i++) {
			if(answers[i] == a[i%5]) cnt_a++;
			if(answers[i] == b[i%8]) cnt_b++;
			if(answers[i] == c[i%10]) cnt_c++;
		}
		
		int max = Math.max(cnt_a, Math.max(cnt_b, cnt_c));
		ArrayList<Integer> list = new ArrayList<Integer>();		
		
		if(max == cnt_a) list.add(1);
		if(max == cnt_b) list.add(2);
		if(max == cnt_c) list.add(3);
		int[] res = new int[list.size()];
		
		for(int i=0; i<list.size(); i++) {
			res[i] = list.get(i);
		}

		return res;
	}

	public static void main(String[] args) {
		
		int[] answer = {1,3,2,4,2};
		System.out.println(Arrays.toString(solution(answer)));
	}

}
