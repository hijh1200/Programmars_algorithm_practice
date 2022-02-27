package Programmars_algorithm_practice.Level_2;

import java.util.ArrayList;
import java.util.HashMap;

public class compression {
	public static int[] solution(String msg) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        char ch = 'A';
        for(int i=0; i<26; i++) { hm.put(ch+"", i+1); ch++; }
        
        int idx = 27;
        for(int i=0; i<msg.length(); i++) {
            String s = msg.charAt(i)+"";
            
            while(true) {
                if(i+1<msg.length()) {
                    if(hm.containsKey(s + msg.charAt(i+1))) {
                        s += msg.charAt(i+1);
                        i++;                    
                    } else break;
                } else break;
            }
            ans.add(hm.get(s));
            if(i+1<msg.length()) hm.put(s + msg.charAt(i+1), idx++);
        }
        
        int[] answer = new int[ans.size()];
        for(int i=0; i<answer.length; i++) { answer[i] = ans.get(i); }
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("KAKAO"));
	}

}
