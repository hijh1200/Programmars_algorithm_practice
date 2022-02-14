package Coding_Test;

import java.util.PriorityQueue;

public class test1 {
	public static int solution(int[] t, int m) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i: t) pq.add(i);
		
		int res = 0;
		
		// 전차의 수가 가장 작은 m개의 기지 추출 
		for(int i=0; i<m; i++) {
			res += pq.poll();
		}
		
        return res + m;
    }

	public static void main(String[] args) {
		int[] t = {1,100,100,100,100,100};
		System.out.println(solution(t, 1));
	}

}
