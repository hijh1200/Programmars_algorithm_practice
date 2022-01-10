package Programmars_algorithm_practice.Level_1;
import java.util.Arrays;
import java.util.PriorityQueue;
public class take_two_and_add {
	public static int[] solution(int[] numbers) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				if(!pq.contains(numbers[i] + numbers[j])) {
					pq.add(numbers[i] + numbers[j]);
				}
			}
		}
		
		int size = pq.size();
		int[] res = new int[size];
		for(int i=0; i<size; i++) {
			res[i] = pq.poll();
		}
		return res;
	}

	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		System.out.println(Arrays.toString(solution(numbers)));
	}

}
