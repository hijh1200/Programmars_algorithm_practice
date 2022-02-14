package Programmars_algorithm_practice.Level_2;

import java.util.Arrays;

public class Counting_after_quadcompression {
    public static int[] answer = new int[2];
    public static void divide(int[][] arr, int n, int iStart, int jStart) {
    	int num = arr[iStart][jStart];
        boolean flag = true;
        
        for(int i=iStart; i<iStart+n; i++) {
            for(int j=jStart; j<jStart+n; j++) {
                if(num != arr[i][j]) {
                    flag = false; break;
                }
            } if(!flag) break;
        }
        
        if(flag) answer[num]++;
        else {
            divide(arr, n/2, iStart, jStart);
            divide(arr, n/2, iStart+n/2, jStart);
            divide(arr, n/2, iStart, jStart+n/2);
            divide(arr, n/2, iStart+n/2, jStart+n/2);
        }
    }
    public static int[] solution(int[][] arr) {
    	int n = arr.length;
        divide(arr, n, 0, 0);
        
        return answer;
    }
    
	public static void main(String[] args) {
		int[][] arr = {
				{1,1,0,0},
				{1,0,0,0},
				{1,0,0,1},
				{1,1,1,1}};
		System.out.println(Arrays.toString(solution(arr)));
	}
}
