package Programmars_algorithm_practice.Level_1;

public class Find_decimals {
	public static boolean isPrime(int n) {
		for(int i=2; i<= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	
	public static int solution(int n) {
		int res = 0;
		for(int i=2; i<=n; i++) {
			if(isPrime(i)) {
				res++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int n =10;
		System.out.println(solution(n));
	}

}
