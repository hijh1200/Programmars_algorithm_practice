package Programmars_algorithm_practice.Level_1;

public class year2016 {
	public static String solution(int a, int b) {
		int[] monthdays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sum = 0;
		for(int i=0; i<a-1; i++) {
			sum += monthdays[i];
		}
		sum = sum + b - 1;
		int idx = sum % 7;
		
		String[] days = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
		return days[idx];
	}

	public static void main(String[] args) {
		int a = 1;
		int b = 8;
		System.out.println(solution(a, b));
	}

}
