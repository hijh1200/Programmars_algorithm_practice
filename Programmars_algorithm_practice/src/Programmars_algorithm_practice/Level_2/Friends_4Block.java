package Programmars_algorithm_practice.Level_2;

import java.util.Arrays;

public class Friends_4Block {
	public static int solution(int m, int n, String[] board) {
		int cnt = 0;
		int prevcnt = -1;
        while(true) {
        	boolean[][] pop = new boolean[m][n];
        	// ��Ʈ�� ��� ��ġ ǥ��
        	for(int i=0; i<m-1; i++) {
        		for(int j=0; j<n-1; j++) {
        			if(board[i].charAt(j) == ' ') continue;
        			if(board[i].charAt(j) == board[i].charAt(j+1)
        				&& board[i].charAt(j) == board[i+1].charAt(j)
        				&& board[i].charAt(j) == board[i+1].charAt(j+1)) {
	        				pop[i][j] = true;
	        				pop[i][j+1] = true;
	        				pop[i+1][j] = true;
	        				pop[i+1][j+1] = true;
        			}
        		}
        	}
        	
        	// ��Ʈ�� ��� ���� ����
        	for(int i=0; i<m; i++) {
        		for(int j=0; j<n; j++) {
        			if(pop[i][j]) cnt++;
        		}
        	}
        	// ��Ʈ������ ���ڸ��� ���� ��� ������
        	while(true) {
        		boolean flag = false;
	        	for(int i=0; i<m-1; i++) {
	        		for(int j=0; j<n; j++) {
	        			if(pop[i+1][j]) {
	        				flag = true;
	        				pop[i+1][j] = false;
	        				board[i+1] = board[i+1].substring(0,j) + board[i].charAt(j) + board[i+1].substring(j+1, board[i+1].length());
	        				pop[i][j] = true;
	        				board[i] = board[i].substring(0,j) + " " + board[i].substring(j+1, board[i].length());
	        			}
	        		}
	        	}
	        	if(!flag) break;
        	}
        	
        	//������ ���ٸ� Ż��
        	if(prevcnt == cnt) break;
        	prevcnt = cnt;
        }
        return cnt;
    }
	public static void main(String[] args) {
//		String[] board = {
//							"CCBDE", 
//							"AAADE", 
//							"AAABF", 
//							"CCBBF"
//						};
		String[] board = {
				"TTTANT", 
				"RRFACC", 
				"RRRFCC", 
				"TRRRAA", 
				"TTMMMF", 
				"TMMTTJ"
				};		
		
		System.out.println(solution(6,6,board));
	}

}
