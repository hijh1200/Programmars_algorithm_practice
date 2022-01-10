package Programmars_algorithm_practice.Level_1;
import java.util.*;
public class Number_and_addition_of_factors {
	public static int numFactor(int num) {
		int cnt = 0;
		int x = 0;
		for(int i=1; i<Math.sqrt(num); i++) {
			if(num % i == 0) cnt++;
		}
		if(num % Math.sqrt(num) == 0) x++;
		return cnt * 2 + x;
	}
	
	public static int solution(int left, int right) {
		int sum = 0;
		for(int i=left; i<=right; i++) {
			if(numFactor(i) % 2 == 0) {
				sum += i;
			}
			else {
				sum -= i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int left = 24;
		int right = 27;
		System.out.println(solution(left, right));
	}

}
