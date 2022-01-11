package Programmars_algorithm_practice.Level_1;

import java.util.PriorityQueue;

public class divisible_array_of_numbers {
	public static int[] solution(int[] arr, int divisor) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % divisor == 0) {
				pq.add(arr[i]);
			}
		}
		if(pq.isEmpty()) {
			int[] res = {-1};
			return res;
		}
		int[] res = new int[pq.size()];
		for(int i=0; i<res.length; i++) {
			res[i] = pq.poll();
		}
		
		return res;
	}

	public static void main(String[] args) {
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		System.out.println(solution(arr, divisor));
	}

}
