package Programmars_algorithm_practice.Level_2;

import java.util.*;
public class function_development {

	public static int[] solution(int[] progresses, int[] speeds) {
		int[] deploy = new int[progresses.length];
		for(int i=0; i<progresses.length; i++) {
			deploy[i] = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
		}
		
		int cnt = 1;
		int max = deploy[0];
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(Arrays.toString(deploy));
		for(int i=1; i<deploy.length; i++) {
			if(max >= deploy[i]) {
				cnt++;
				continue;
			}
			else {
				max = deploy[i];
				list.add(cnt);
				cnt = 1;
			}
		}
		list.add(cnt);
		
		int[] res = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			res[i] = list.get(i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] progresses = {20, 99, 93, 30, 55, 10};
		int[] speeds = {5, 10, 1, 1, 30, 5};
//		int[] progresses = {93, 30, 55};
//		int[] speeds = {1, 30, 5};
		System.out.println(Arrays.toString(solution(progresses, speeds)));
	}

}
