package Programmars_algorithm_practice.Level_2;

import java.util.Arrays;
import java.util.HashMap;

public class take_a_group_photo {
	public static HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
	public static int answer;
	
	public static boolean check(String[] data, char[] position) {
		String str = new String(position);
		for(int i=0; i<data.length; i++) {
			int idx1 = str.indexOf(data[i].charAt(0));
			int idx2 = str.indexOf(data[i].charAt(2));
			
			if(data[i].charAt(3) == '>') {
				if(Math.abs(idx1 - idx2) - 1 > data[i].charAt(4) - '0' ) {
					 continue;
				}
			}
			else if(data[i].charAt(3) == '<') {
				if(Math.abs(idx1 - idx2) - 1 < data[i].charAt(4) - '0') {
					 continue;
				}
			}
			else {
				if(Math.abs(idx1 - idx2) - 1 == 0) {
					 continue;
				}
			}
			
			return false;
		}
		
		return true;
	}
	public static void search(int i, boolean[] visited, char[] position, String[] data) {
		if(i==8) {
			if(check(data, position)) {
				answer++;
			}
			return;
		}
		
		for(int j=0; j<8; j++) {
			if(visited[j] == false) {
				position[i] = hm.get(j);
				visited[j] = true;
				search(i+1, visited, position, data);
				visited[j] = false;
			}
		}
	}
	
	public static int solution(int n, String[] data) {
		char[] position = new char[8];
		hm.put(0,'A'); hm.put(1,'C'); hm.put(2,'F'); hm.put(3,'J'); hm.put(4,'M'); hm.put(5,'N'); hm.put(6,'R'); hm.put(7,'T');
		boolean[] visited = new boolean[8];
		answer = 0;
		
		search(0, visited, position, data);
		
		return answer;
	}
	public static void main(String[] args) {
		int n = 2;	//A, C, F, J, M, N, R, T
		String[] data = {"N~F=0", "R~T>2"};
		System.out.println(solution(n, data));
	}

}
