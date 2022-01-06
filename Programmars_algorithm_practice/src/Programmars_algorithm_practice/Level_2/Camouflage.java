package Programmars_algorithm_practice.Level_2;
import java.util.*;
public class Camouflage {
	public static int solution(String[][] clothes) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i<clothes.length; i++) {
			if(hm.containsKey(clothes[i][1])) {
				hm.put(clothes[i][1], hm.get(clothes[i][1]) + 1);
			}
			else {
				hm.put(clothes[i][1], 1);
				list.add(clothes[i][1]);
			}
		}
		int res = 1;
		for(int i=0; i<list.size(); i++) {
			res = res * (hm.get(list.get(i)) + 1);
		}
		return res - 1;
	}

	public static void main(String[] args) {
		String[][] clothes = {
						{"yellowhat", "headgear"}, 
						{"bluesunglasses", "eyewear"}, 
						{"green_turban", "headgear"}
					};
		System.out.println(solution(clothes));
	}
}
