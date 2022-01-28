package Programmars_algorithm_practice.Level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class menu_renewal {
	public static ArrayList<String> list = new ArrayList<String>();
	public static void combination(String s, boolean[] visited, int size, int cnt, int idx) {
		if(idx == visited.length) {
			if(cnt == size) {
				String str = "";
				for(int i=0; i<visited.length; i++) {
					if(visited[i]) str += s.charAt(i);
				}
				list.add(str);
			}
		}
		else {
			visited[idx] = false;
			combination(s, visited, size, cnt, idx+1);
			
			visited[idx] = true;
			combination(s, visited, size, cnt+1, idx+1);
		}
	}
	
	public static String[] solution(String[] orders, int[] course) {
		for(int i=0; i<course.length; i++) {
			for(int j=0; j<orders.length; j++) {
				boolean[] visited = new boolean[orders[j].length()];
				int size = course[i];
				combination(orders[j], visited, size, 0, 0);
			}
		}
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.size());
		
		String[] res= {};
		return res;
	}
	public static void main(String[] args) {
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = {2,3,4};
		System.out.println(solution(orders, course));
	}

}
