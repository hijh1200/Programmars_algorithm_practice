package Coding_Test;

import java.util.ArrayList;
import java.util.HashMap;

public class test3 {
	public static int solution(String[] color, int[] prices) {
		int res = 0;
		HashMap<Character, Integer> up = new HashMap<>();	// 상의 <색깔, 수>
		HashMap<Character, Integer> down = new HashMap<>();	// 하의 <색깔, 수>
		
		// 상하의 <색깔, 수> 삽입
		for(int i=0; i<color.length; i++) {
			if(up.containsKey(color[i].charAt(0))) up.put(color[i].charAt(0), up.get(color[i].charAt(0))+1);
			else up.put(color[i].charAt(0), 1);
			
			if(down.containsKey(color[i].charAt(1))) down.put(color[i].charAt(1), down.get(color[i].charAt(1))+1);
			else down.put(color[i].charAt(1), 1);
		}
		
		// 상하의가 같은 색으로 구성된 세트의 수 구별
		for(Character k: up.keySet()) {
			if(down.containsKey(k)) {
				int min = Math.min(up.get(k), down.get(k));
				res += prices[0] * min;
				
				if(up.get(k) > down.get(k)) {
					up.put(k, up.get(k) - min);
					down.put(k, 0);
				} 
				else if(up.get(k) < down.get(k)) {
					down.put(k, down.get(k) - min);
					up.put(k, 0);
				}
				else {
					up.put(k, 0);
					down.put(k, 0);
				}
			}
		}
		
		ArrayList<Character> upList = new ArrayList<>();	// 같은 색 세트 구별 후 남은 상의 
		ArrayList<Character> downList = new ArrayList<>();	// 같은 색 세트 구별 후 남은 하의 
		
		// 같은 색 세트 구별 후 남은 상하의 구별
		for(char k: up.keySet()) {
			if(up.get(k) != 0) {
				for(int i=0; i<up.get(k); i++) upList.add(k);
			}
		}
		for(char k: down.keySet()) {
			if(down.get(k) != 0) {
				for(int i=0; i<down.get(k); i++) downList.add(k);
			}
		}
		
		
		// 남은 상하의 수 가격 측정
		
		// 같은 색 세트*2 가 다른 색 세트 가격보다 싸다면
		if(prices[0]*2 < prices[1]) {
			res += prices[0] * (upList.size() + downList.size());
		}
		
		// 남은 상하의 수가 홀수라면 혹은 짝수라면
		else {
			if((upList.size() + downList.size())%2 != 0) {
				res += prices[0];
			} 
			res += (upList.size() + downList.size()) / 2 * prices[1];
		}
        return res;
    }
	public static void main(String[] args) {
		String[] color = {"YG", "GG", "GG"};	//"RG", "WR", "BW", "GG"
		int[] prices = {200, 300};
		System.out.println(solution(color, prices));
	}

}
