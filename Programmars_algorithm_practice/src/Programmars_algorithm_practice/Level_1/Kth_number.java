package Programmars_algorithm_practice.Level_1;

import java.util.Arrays;
public class Kth_number {
	public static int[] solution(int[] array, int[][] commands) {
		int[] res = new int[commands.length];
		for(int i=0; i<commands.length; i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(temp);
			res[i] = temp[commands[i][2]-1];	
		}	
		return res;
	}

	public static void main(String[] args) {

		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		System.out.println(Arrays.toString(solution(array, commands)));
	}

}
