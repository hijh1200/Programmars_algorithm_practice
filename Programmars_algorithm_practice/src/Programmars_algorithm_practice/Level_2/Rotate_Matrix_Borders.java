package Programmars_algorithm_practice.Level_2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Rotate_Matrix_Borders {
	public static void deepCopy(int[][] matrix, int[][] temp) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				temp[i][j] = matrix[i][j];
			}
		}
	}
	
	public static int[] solution(int rows, int columns, int[][] queries) {
        int[][] matrix = new int[rows][columns];
        int[] answer = new int[queries.length];
        
        for(int i=0; i<rows; i++) {
        	for(int j=0; j<columns; j++) {
        		matrix[i][j] = i * columns + j + 1;
        	}
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(int i=0; i<queries.length; i++) {
        	int x1, y1, x2, y2;
        	x1 = queries[i][0]-1; y1 = queries[i][1]-1;
        	x2 = queries[i][2]-1; y2 = queries[i][3]-1;
        	
        	int temp[][] = new int[matrix.length][matrix[0].length];
        	deepCopy(matrix, temp);
        	       	
        	for(int y=y1; y<=y2; y++) {
        		if (y-1>=0) {
        			matrix[x1][y] = temp[x1][y-1];
        		}
        	}
        	//
        	for(int x=x1; x<=x2; x++) {
        		if(x-1>=0) {
        			matrix[x][y2] = temp[x-1][y2];
        		}
        	}
        	matrix[x1][y2] = temp[x1][y2-1];
        	//
        	for(int y=y1; y<=y2; y++) {
        		if(y+1<columns) {
        			matrix[x2][y] = temp[x2][y+1];
        		}
        	}
        	matrix[x2][y2] = temp[x2-1][y2];
        	//
        	for(int x=x1; x<=x2; x++) {
        		if(x+1<rows) {
        			matrix[x][y1] = temp[x+1][y1];
        		}
        	}
        	matrix[x2][y1] = temp[x2][y1+1];
        	//
        	for(int x=x1; x<=x2; x++) {
        		pq.add(matrix[x][y1]);
        		pq.add(matrix[x][y2]);
        	}
        	for(int y=y1; y<=y2; y++) {
        		pq.add(matrix[x1][y]);
        		pq.add(matrix[x2][y]);
        	}
        	
        	answer[i] = pq.peek();
        	pq.clear();
        }
        return answer;
    }
	public static void main(String[] args) {
		int[][] queries = {
				{2,2, 5,4},
				{3,3, 6,6},
				{5,1, 6,3}
		};
		System.out.println(Arrays.toString(solution(6, 6, queries)));
	}

}
