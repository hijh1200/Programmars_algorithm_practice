
package Programmars_algorithm_practice.Level_1;
import java.util.Arrays;
// �ζ��� �ְ� ������ ���� ����
public class The_highest_and_lowest_ranks_of_the_lottery {
	public static int[] solution(int[] lottos, int[] win_nums) {
		int count = 0;			// ���� ����
		int zero_count = 0;		// 0 ����
		int a, b = 0;
		int[] answer = new int[2];	// ����
		
		for(int i=0; i<6; i++) {
			if(lottos[i] == 0) {
				zero_count += 1;
			}
		}
		
		for(int i=0; i<6; i++ ) {
			for(int j=0; j<6; j++) {
				if(lottos[i] == win_nums[j]) {
					count++;
				}
			}
		}
		
		a = 7 - count;
		b = 7 - (count + zero_count);
		
		if(b == 7) b = 6;	// count, zero_count ��� 0�� ���
		answer[0] = b;
		if(a == 7) a = 6;	// count �� 0�� ���
		answer[1] = a;
		return answer;
    }
	
	public static void main(String[] args) {
		int[] lottos = {45, 4, 35, 20, 3, 9};
		int[] win_nums = {20, 9, 3, 45, 4, 35};
		System.out.println(Arrays.toString(solution(lottos, win_nums)));
	}

}
