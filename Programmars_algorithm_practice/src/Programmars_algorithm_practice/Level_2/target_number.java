package Programmars_algorithm_practice.Level_2;

public class target_number {
	static int answer = 0;
	public static void dfs(int[] numbers, int target, int index, int sum) {
		if(index == numbers.length) {
			if(sum == target) answer++;
			return;
		}
		sum = sum + numbers[index];
		dfs(numbers, target, index+1, sum);
		sum = sum - numbers[index] * 2;
		dfs(numbers, target, index+1, sum);
	}
	
	public static int solution(int[] numbers, int target) {
		dfs(numbers, target, 0, 0);
		return answer;
	}
	public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		System.out.println(solution(numbers, target));
	}

}
