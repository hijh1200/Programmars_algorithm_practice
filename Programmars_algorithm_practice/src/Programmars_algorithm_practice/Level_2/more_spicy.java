package Programmars_algorithm_practice.Level_2;

import java.util.Arrays;
import java.util.PriorityQueue;
public class more_spicy {
	public static int solution(int[] scoville, int K) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0; i<scoville.length; i++) {
			pq.add(scoville[i]);
		}
		
		int cnt = 0;
		while(true) {
			if(pq.peek() >= K) {
				break;
			}
			else if(pq.size() == 1) {
				return -1;
			}
			else {
				pq.add(pq.poll() + pq.poll() * 2);
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		int[] scovile = {1,1};
		int K = 7;
		System.out.println(solution(scovile, K));
	}

}
