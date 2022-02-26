package Programmars_algorithm_practice.Level_2;

public class Find_largest_square {
	public static int solution(int [][]board) {
        if(board.length==1) return 1;
        int max = 0;
        for(int i=1; i<board.length; i++) {
            for(int j=1; j<board[0].length; j++) {
                if(board[i][j]!=0 && board[i-1][j]!=0 && board[i][j-1]!=0 && board[i-1][j-1]!=0) {
                    board[i][j] = Math.min(Math.min(board[i-1][j], board[i][j-1]), board[i-1][j-1]) + 1;
                }
                if(max < board[i][j]) max = board[i][j];
            }
        }
        return max*max;
    }
	public static void main(String[] args) {
		int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		System.out.println(solution(board));
	}

}
