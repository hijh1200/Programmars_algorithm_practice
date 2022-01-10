package Programmars_algorithm_practice.Level_1;

public class Find_a_number_whose_remainder_is_1 {
	public static int solution(int n) {
		int x = 2;
		while(true) {
			if(n % x == 1) break;
			x++;
		}
		return x;
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println(solution(n));
	}

}
