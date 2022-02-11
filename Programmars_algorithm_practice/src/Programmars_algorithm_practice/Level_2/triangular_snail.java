package Programmars_algorithm_practice.Level_2;

import java.util.Arrays;

public class triangular_snail {
    public static int[] solution(int n) {
    	int[] answer = new int[(n*(n+1)) / 2];
    	if(n==1) {
    		answer[0] = 1;
    		return answer;
    	}
    	
    	int[][] arr = new int[n][n];
    	int i = 0;
    	int j = 0;
    	int cnt = 1;
    	int side = n;
    	
    	while(true) {
    		for(int k=0; k<side-1; k++) {
        		arr[i][j] = cnt;
        		i++;
        		cnt++;
        	} 
    		for(int k=0; k<side-1; k++) {
        		arr[i][j] = cnt;
        		j++;
        		cnt++;
        	}
    		for(int k=0; k<side-1; k++) {
        		arr[i][j] = cnt;
        		i--;
        		j--;
        		cnt++;
        	}
    		side-=3;
    		if(side==1) arr[i+2][j+1] = cnt;
    		if(side<=0) break; 
    		i+=2;
    		j+=1;
    	}
    	
    	int idx = 0;
    	for(int x=0; x<n; x++) {
    		for(int y=0; y<n; y++) {
    			if(arr[x][y] != 0) {
    				answer[idx++] = arr[x][y];
    			} else break;
    		}
    	}
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(6)));
	}

}
