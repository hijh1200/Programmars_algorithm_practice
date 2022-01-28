package Programmars_algorithm_practice.Level_2;

import java.util.Arrays;

public class target_number {
	public static int cnt;
	public static void dfs(boolean[] visited, int[] numbers, int target, int idx) {
		if(idx == visited.length) {
			int sum = 0;
			for(int i=0; i<visited.length; i++) {
				if(visited[i]) sum += numbers[i] * -1;
				else sum += numbers[i];
			}
			if(sum == target) cnt++;
		}
		else {
			visited[idx] = false;
			dfs(visited, numbers, target, idx+1);
			
			visited[idx] = true;
			dfs(visited, numbers, target, idx+1);
		}
	}
	
	public static int solution(int[] numbers, int target) {
		cnt = 0;
		boolean[] visited = new boolean[numbers.length];
		dfs(visited, numbers, target, 0);
		return cnt;
	}
	public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		System.out.println(solution(numbers, target));
	}

}
