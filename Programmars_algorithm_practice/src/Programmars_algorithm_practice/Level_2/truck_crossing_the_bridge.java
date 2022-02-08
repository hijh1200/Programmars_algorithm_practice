package Programmars_algorithm_practice.Level_2;
import java.util.Queue;
import java.util.LinkedList;

public class truck_crossing_the_bridge {
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		Queue<Integer> b = new LinkedList<>();
		Queue<Integer> q = new LinkedList<>();
		for(int i:truck_weights) q.add(i);
		int currentWeight = 0;
		int cnt = 0;
		
		while(!q.isEmpty()) {
			if(b.size() < bridge_length && currentWeight + q.peek() <= weight) {
				currentWeight += q.peek();
				b.add(q.poll());
				cnt++;
			}
			else {
				if(b.size() == bridge_length) {
					currentWeight -= b.poll();
				}
				else {
					cnt++;
					b.add(0);
				}
			}
		}
        return cnt+ bridge_length;
	}
	public static void main(String[] args) {
		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};

		System.out.println(solution(100, 100, truck_weights));
	}

}
