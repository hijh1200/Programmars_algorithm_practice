package Programmars_algorithm_practice.Level_1;

// 크레인 인형뽑기 게임
import java.util.Stack;
public class crane_puppet_game {

	public static int solution(int[][] board, int[] moves) {
		int result = 0;
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		for(int i=0; i<moves.length; i++) {
			int el = 0;
			for(int j=0; j<board.length; j++) {
				if(board[j][moves[i]-1] != 0) {
					el = board[j][moves[i]-1];
					board[j][moves[i]-1] = 0;
					
						if(stack.peek() == el) {
							stack.pop();
							result += 2;
						}
						else {
							stack.push(el);
						}
					break;
				}
			}
		}
		return result;
	}
//	System.out.println("*");
	public static void main(String[] args) {
		int[][] board = {
				{0,0,0,0,0},
				{0,0,1,0,3},
				{0,2,5,0,1},
				{4,2,4,4,2},
				{3,5,1,3,1}};
		
		int[] moves = {1,5,3,5,1,2,1,4};
		System.out.println(solution(board, moves));
	}

}
