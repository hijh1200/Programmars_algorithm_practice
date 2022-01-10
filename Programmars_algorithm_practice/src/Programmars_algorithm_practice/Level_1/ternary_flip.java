package Programmars_algorithm_practice.Level_1;

import java.util.LinkedList;
import java.util.Queue;

public class ternary_flip {
	public static int solution(int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		while(n != 0) {
			q.add(n % 3);
			n /= 3;
		}
		int size = q.size();
		int res = 0;
		for(int i=size-1; i>=0; i--) {
			res += q.poll() * Math.pow(3, i);
		}
		return res;
	}
	public static void main(String[] args) {
		int n = 125;
		System.out.println(solution(n));
	}

}
