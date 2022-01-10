package Programmars_algorithm_practice.Level_1;

public class Calculate_the_shortfall {
	public static long solution(int price, int money, int count) {
		long sum = 0;
		for(int i=1 ;i<=count; i++) {
			sum += price * i;
		}
		if(money >= sum) return 0;
		return sum - money;
	}
	public static void main(String[] args) {
		int price = 3;
		int money = 20;
		int count = 4;
		System.out.println(solution(price, money, count));
	}

}
