package Programmars_algorithm_practice.Level_2;

import java.util.ArrayList;

public class decimals {
	public static int solution(String numbers) {
		int cnt = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for(int i=0; i<numbers.length(); i++) {
				list.add(Integer.parseInt(numbers.substring(i, i+1)));
		}
		
		
		
		
		System.out.println(list);
		
		return cnt;
	}
	public static boolean isPrime(int num) {
		if(num == 2) return false;
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String numbers = "17";
		System.out.println(solution(numbers));
	}

}
