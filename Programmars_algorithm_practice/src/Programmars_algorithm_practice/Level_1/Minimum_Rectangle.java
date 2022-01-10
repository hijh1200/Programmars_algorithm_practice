package Programmars_algorithm_practice.Level_1;

public class Minimum_Rectangle {
	public static int solution(int[][] sizes) {
		int temp = 0;
		int max_w = 1;
		int max_h = 1;
		for(int i=0; i<sizes.length; i++) {
			if(sizes[i][0] < sizes[i][1]) {
				temp = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = temp;
			}
			if(sizes[i][0] > max_w) max_w = sizes[i][0];
			if(sizes[i][1] > max_h) max_h = sizes[i][1];
		}
		return max_w * max_h;
	}
	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		System.out.println(solution(sizes));
	}

}
