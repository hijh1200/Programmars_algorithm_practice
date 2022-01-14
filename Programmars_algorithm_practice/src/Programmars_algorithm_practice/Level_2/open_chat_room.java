package Programmars_algorithm_practice.Level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class open_chat_room {
	public static HashMap<String, String> hm = new HashMap<String, String>();
	
	public static void match(String s) {
		String[] strarr = s.split(" ");
		if(strarr[0].equals("Enter") || strarr[0].equals("Change")) {
			hm.put(strarr[1], strarr[2]);
		}
	}
	
	public static String chat(String s) {
		String[] strarr = s.split(" ");
		String res = null;
		if(strarr[0].equals("Enter")) {
			res = hm.get(strarr[1]) + "´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.";
		}
		else if(strarr[0].equals("Leave")) {
			res = hm.get(strarr[1]) + "´ÔÀÌ ³ª°¬½À´Ï´Ù.";
		}
		return res;
	}
	
	public static String[] solution(String[] record) {
		ArrayList<String> reslist = new ArrayList<String>();
		
		for(int i=0; i<record.length; i++) {
			match(record[i]);
		}
		
		for(int i=0; i<record.length; i++) {
			if(chat(record[i]) == null) continue;
			reslist.add(chat(record[i]));
		}
		
		String[] res = new String[reslist.size()];
		for(int i=0; i<reslist.size(); i++) {
			res[i] = reslist.get(i);
		}
		
		return res;
	}
	public static void main(String[] args) {
		String[] record = {
				"Enter uid1234 Muzi", 
				"Enter uid4567 Prodo",
				"Leave uid1234",
				"Enter uid1234 Prodo",
				"Change uid4567 Ryan"
				};
		System.out.println(Arrays.toString(solution(record)));
	}

}
