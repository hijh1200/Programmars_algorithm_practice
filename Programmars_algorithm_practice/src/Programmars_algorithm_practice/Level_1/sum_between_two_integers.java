package Programmars_algorithm_practice.Level_1;

public class sum_between_two_integers {
	public static long solution(int a, int b) {
		long res = 0;
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		for(int i=min; i<=max; i++) {
			res += i;
		}
		return res;
	}

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		System.out.println(solution(a, b));
	}

}
