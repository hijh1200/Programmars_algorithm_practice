package Programmars_algorithm_practice.Level_1;

import java.util.Arrays;
import java.util.Stack;

public class secret_map {
	public static int[] binary(int num, int n) {
		Stack<Integer> stack =new Stack<Integer>();
		while(num != 0) {
			stack.add(num%2);
			num /= 2;
		}
		int[] res = new int[n];
		for(int i=0; i<n; i++) {
			if(i < n - stack.size()) {
				res[i] = 0;
				continue;
			}
			res[i] = stack.pop();
		}
		return res;
	}
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		int[][] arr11 = new int[n][n];
		int[][] arr22 = new int[n][n];
		
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i] = "";
			for(int j=0; j<n; j++) {
				str[i] = str[i] + "#";
			}
			
		}
		
		
		for(int i=0; i<n; i++) {
			int[] temp1 = binary(arr1[i], n);
			int[] temp2 = binary(arr2[i], n);
			int[] temp3 = new int[n];
			for(int j=0; j<n; j++) {
				if(temp1[j] == 0 && temp2[j] == 0) {
					temp3[j] = 1;
				}
			}
			
			for(int k=0; k<n; k++) {
				if(temp3[k] == 1) {
					str[i] = str[i].substring(0, k) + " " + str[i].substring(k+1, n);
				}
			}
		}
		return str;
	}

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		System.out.println(solution(n, arr1, arr2));
	}

}
