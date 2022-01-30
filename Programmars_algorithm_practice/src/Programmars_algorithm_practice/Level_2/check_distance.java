package Programmars_algorithm_practice.Level_2;

import java.util.ArrayList;
import java.util.Arrays;

public class check_distance {
	public static boolean check(String[] room, int x1, int y1, int x2, int y2) {
		if(Math.abs(x1-x2) + Math.abs(y1-y2) == 1) {
			return false;
		}
		else {	
			if(x1 == x2) {
				if(room[x1].charAt((y1+y2)/2) != 'X') {
					return false;
				}
				else {
					return true;
				}
			}
			else if(y1 == y2) {
				if(room[(x1+x2)/2].charAt(y1) != 'X') {
					return false;
				}
				else {
					return true;
				}
			}
			
			else {
				if(room[Math.max(x1, x2)].charAt(Math.max(y1, y2)) == 'O') {
					return false;
				}
				if(room[Math.max(x1, x2)-1].charAt(Math.max(y1, y2)) == 'O') {
					return false;
				}
				if(room[Math.max(x1, x2)].charAt(Math.max(y1, y2)-1) == 'O') {
					return false;
				}
				if(room[Math.max(x1, x2)-1].charAt(Math.max(y1, y2)-1) == 'O') {
					return false;
				}
			}
		}
		return true;
	}
	
	public static int[] solution(String[][] places) {
		int[] res = {1,1,1,1,1};
		ArrayList<Integer> xlist = new ArrayList<Integer>();
		ArrayList<Integer> ylist = new ArrayList<Integer>();
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				for(int k=0; k<5; k++) {
					if(places[i][j].charAt(k) == 'P') {
						xlist.add(j);
						ylist.add(k);
					}
				}
			}
			
			for(int j=0; j<xlist.size()-1; j++) {
				for(int k=j+1; k<xlist.size(); k++) {
					if(Math.abs(xlist.get(j)-xlist.get(k)) + Math.abs(ylist.get(j)-ylist.get(k)) <= 2) {
						if(!check(places[i], xlist.get(j), ylist.get(j), xlist.get(k), ylist.get(k))) {
							res[i] = 0;
							break;
						}
					}
				}
				if(res[i]==0) break;
			}
			xlist.clear();
			ylist.clear();
		}
		return res;
	}
	public static void main(String[] args) {
		String[][] places = {
				{
					"POOOP", 
					"OXXOX", 
					"OPXPX", 
					"OOXOX", 
					"POXXP"
				}, 
				{
					"POOPX", 
					"OXPXP", 
					"PXXXO", 
					"OXXXO", 
					"OOOPP"
				}, 
				{
					"PXOPX", 
					"OXOXP", 
					"OXPOX", 
					"OXXOP", 
					"PXPOX"
				}, 
				{
					"OOOXX", 
					"XOOOX", 
					"OOOXX", 
					"OXOOX", 
					"OOOOO"
				}, 
				{
					"PXPXP", 
					"XPXPX", 
					"PXPXP", 
					"XPXPX", 
					"PXPXP"
				}
		};
		System.out.println(Arrays.toString(solution(places)));
	}

}
