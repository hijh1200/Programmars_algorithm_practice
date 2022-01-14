package Programmars_algorithm_practice.Level_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Kakao_Friends_Coloring_Book {
	public static int space = 1;
	public static int cnt = 0;
	public static PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
	
	public static void search(int i, int j, int[][] picture, boolean[][] visited) {
		
		if(picture[i][j] != 0 && visited[i][j] == false) {
			visited[i][j] = true;
			
			//picture[i-1][j]
			if(0 <= i-1 && i-1 < picture.length && 0 <= j && j < picture[0].length) {
				if(visited[i-1][j] == false && picture[i-1][j] == picture[i][j]) {
					space++;
					search(i-1, j, picture, visited);
				}
			}
			//picture[i+1][j]
			if(0 <= i+1 && i+1 < picture.length && 0 <= j && j < picture[0].length) {
				if(visited[i+1][j] == false && picture[i+1][j] == picture[i][j]) {
					space++;
					search(i+1, j, picture, visited);
				}
			}
			//picture[i][j-1]
			if(0 <= i && i < picture.length && 0 <= j-1 && j-1 < picture[0].length) {
				if(visited[i][j-1] == false && picture[i][j-1] == picture[i][j]) {
					space++;
					search(i, j-1, picture, visited);
				}
			}
			//picture[i][j+1]
			if(0 <= i && i < picture.length && 0 <= j+1 && j+1 < picture[0].length) {
				if(visited[i][j+1] == false && picture[i][j+1] == picture[i][j]) {
					space++;
					search(i, j+1, picture, visited);
				}
			}
		}
	}
	
	public static int[] solution(int m, int n, int[][] picture) {
		boolean[][] visited = new boolean[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(picture[i][j] != 0 && visited[i][j] == false) {
					cnt++;
					search(i, j, picture, visited);
					pq.add(space);
					space = 1;
				}
			}
		}
		
		int[] res = new int[2];
		res[0] = cnt;
		res[1] = pq.peek();
		return res;
	}
	
	public static void main(String[] args) {
		int[][] picture = {
//				{0,1,0},
//				{1,1,0},
//				{0,0,0}
				
//				{1,1,0,0},
//				{0,1,0,0},
//				{0,1,0,1},
//				{1,1,1,1}
				
				{1, 1, 1, 0}, 
				{1, 2, 2, 0}, 
				{1, 0, 0, 1}, 
				{0, 0, 0, 1}, 
				{0, 0, 0, 3}, 
				{0, 0, 0, 3}
		};
		int m = 6;
		int n = 4;
		System.out.println(Arrays.toString(solution(m, n, picture)));
	}

}
