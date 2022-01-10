package Programmars_algorithm_practice.Level_1;

import java.util.Arrays;

public class budget {
	public static int solution(int[] d, int budget) {
		Arrays.sort(d);
		int cnt = 0;
		for(int i=0; i<d.length; i++) {
			if(budget >= d[i]) {
				cnt++;
				budget -= d[i];
			}
			else if(budget < d[i]) {
				break;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		System.out.println(solution(d, budget));
	}

}
