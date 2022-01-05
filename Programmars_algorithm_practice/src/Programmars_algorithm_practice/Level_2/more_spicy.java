package Programmars_algorithm_practice.Level_2;

import java.util.PriorityQueue;
public class more_spicy {
	public static int solution(int[] scoville, int K) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0; i<scoville.length; i++) pq.add(scoville[i]);
		int count = 0;
		
		if(pq.size() == 1) return count;
		while(true) {
			if(pq.peek() > K) return count;
			if(pq.size() == 1) return -1;
			else {
				if(pq.size() < 2) return count;
				int a = pq.poll();
				int b = pq.poll();
				pq.add(a + b * 2);
				count++;
			}
		}
	}

	public static void main(String[] args) {
		int[] scovile = {1, 2, 3, 9, 10, 12};
		int K = 7;
		System.out.println(solution(scovile, K));
	}

}
