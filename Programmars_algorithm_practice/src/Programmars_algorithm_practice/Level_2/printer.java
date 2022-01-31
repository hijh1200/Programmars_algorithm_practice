package Programmars_algorithm_practice.Level_2;
import java.util.*;
public class printer {
	public static int solution(int[] priorities, int location) {
        int idx = location;
        Queue<Integer> q = new LinkedList<Integer>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i : priorities) {q.add(i); pq.add(i);}
        int cnt = 0;
        while(q.size() != 0) {
            if(q.peek() == pq.peek()) {
                pq.poll();
                q.poll();
                cnt++;
                if(idx == 0) return cnt;
            }
            else {
                int temp = q.poll();
                q.add(temp);
            }
            if(idx == 0) idx = q.size() - 1;
            else idx--;
        }
        return 0;
    }

	public static void main(String[] args) {
		int [] priorities = {2, 1, 3, 2};
		int location = 2;
		System.out.println(solution(priorities, location));
	}

}
