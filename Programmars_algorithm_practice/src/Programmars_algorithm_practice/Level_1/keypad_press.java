package Programmars_algorithm_practice.Level_1;
// 키패드 누르기
public class keypad_press {
	public static String solution(int[] numbers, String hand) {
		int[] left = {1,1};
		int[] right = {3,1};
		String result = "";
		
		int[][] num = new int[numbers.length][2];
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] == 0) {num[i][0] = 2; num[i][1] = 1;}		// 2,4	
			if(numbers[i] == 1) {num[i][0] = 1; num[i][1] = 4;}		// 1,4
			if(numbers[i] == 2) {num[i][0] = 2; num[i][1] = 4;}		// 2,4
			if(numbers[i] == 3) {num[i][0] = 3; num[i][1] = 4;}
			if(numbers[i] == 4) {num[i][0] = 1; num[i][1] = 3;}
			if(numbers[i] == 5) {num[i][0] = 2; num[i][1] = 3;}
			if(numbers[i] == 6) {num[i][0] = 3; num[i][1] = 3;}
			if(numbers[i] == 7) {num[i][0] = 1; num[i][1] = 2;}
			if(numbers[i] == 8) {num[i][0] = 2; num[i][1] = 2;}
			if(numbers[i] == 9) {num[i][0] = 3; num[i][1] = 2;}
		}
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				left[0] = num[i][0];
				left[1] = num[i][1];
				result = result + "L"; System.out.println(left[0] + "," + left[1]); continue; 
			} else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				right[0] = num[i][0];
				right[1] = num[i][1];
				result = result + "R"; System.out.println(left[0] + "," + left[1]); continue;
			}
			
			int dis_left;
			int dis_right;
			
			dis_left = Math.abs(num[i][0] - left[0]) + Math.abs(num[i][1] - left[1]);
			dis_right = Math.abs(num[i][0] - right[0]) + Math.abs(num[i][1] - right[1]);
			
			if(dis_left < dis_right) {
				left[0] = num[i][0];
				left[1] = num[i][1];
				result = result + "L";
			} else if(dis_left > dis_right) {
				right[0] = num[i][0];
				right[1] = num[i][1];
				result = result + "R";
			} else {
				if(hand.equals("right")) {
					right[0] = num[i][0];
					right[1] = num[i][1];
					result = result + "R";
				} else {
					left[0] = num[i][0];
					left[1] = num[i][1];
					result = result + "L";
				}
			}
			System.out.println(left[0] + "," + left[1]);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		System.out.println(solution(numbers, hand));
	}

}
