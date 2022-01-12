package Programmars_algorithm_practice.Level_1;

public class watermelon_watermelon {
	public static String solution(int n) {
		String res = "";
		String s = "¼ö";
		String b = "¹Ú";
		
		for(int i=0; i<n; i++) {
			if(i%2 == 0) res = res + s;
			else res = res + b;
		}
		return res;
	}
	public static void main(String[] args) {
		int n = 3;
		System.out.println(solution(n));
	}

}
