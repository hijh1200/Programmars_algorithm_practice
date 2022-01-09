package Programmars_algorithm_practice.Level_2;
import java.util.*;
public class printer {
	public static int solution(int[] priorities, int location) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0; i<priorities.length; i++) {
			pq.add(priorities[i]);
		}
		System.out.println(pq.peek());
		
		
		
		
		
		
		return 0;
	}

	public static void main(String[] args) {
		int [] priorities = {2, 1, 3, 2};
		int location = 2;
		System.out.println(solution(priorities, location));
	}

}
