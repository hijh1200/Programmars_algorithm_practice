package Coding_Test;

import java.util.Arrays;
import java.util.Stack;

public class test2 {
	public static int[] solution(int[] deposit) {
        Stack<Integer> stack = new Stack<>();		// �Ա����� ���
        
        for(int i=0; i<deposit.length; i++) {
			if(deposit[i] > 0) stack.add(deposit[i]);	// �Ա� ���
			
			else {	// ����� ���
				int temp1 = stack.pop();
				int temp2 = deposit[i];
				
				while(true) { 
					if(temp1 + temp2 >= 0) {
						if(temp1 + temp2 > 0) stack.add(temp1 + temp2);
						break;
					}
					else {
						temp2 = temp1 + temp2;
						temp1 = stack.pop();
					}
				}
			}
		}
		
		int[] answer = new int[stack.size()];
		for(int i=answer.length-1; i>=0; i--) {
			answer[i] = stack.pop();
		}
        return answer;
    }
	public static void main(String[] args) {
		int[] deposit = {10000, -10000, 100, 200};
		System.out.println(Arrays.toString(solution(deposit)));
	}

}
