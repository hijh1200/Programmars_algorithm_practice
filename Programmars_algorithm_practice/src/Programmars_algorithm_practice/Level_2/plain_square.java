package Programmars_algorithm_practice.Level_2;

public class plain_square {

	public static long solution(int w, int h) {
		long res = 0;
		for(int i=1; i<w; i++) {
			res += Math.floor( (double) h * i / w);
		}
		return res * 2;
	}
	
	public static void main(String[] args) {
		int w = 8;
		int h = 12;
		System.out.println(solution(w, h));
	}

}
