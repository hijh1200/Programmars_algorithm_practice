package Programmars_algorithm_practice.Level_2;

import java.util.*;
public class function_development {

	public static int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=0; i<progresses.length; i++) {
			int d = (100 - progresses[i]) / speeds[i];
			if((100 - progresses[i]) % speeds[i] != 0) d++;
			q.add(d);	
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		int l = q.size();
		int max = q.poll();
		int cnt = 1;
		
		for(int i=0; i<l; i++) {
			if(q.isEmpty()) {
				result.add(cnt);
				break;
			}
			if(max >= q.peek() ) {
				cnt++;
			}
			else {
				result.add(cnt);
				cnt = 1;
				max = q.peek();
			}
			q.poll();
		}
		
		int[] res = new int[result.size()];
		for(int i=0; i<result.size(); i++) {
			res[i] = result.get(i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		System.out.println(solution(progresses, speeds));
	}

}
