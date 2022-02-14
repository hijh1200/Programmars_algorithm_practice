package Programmars_algorithm_practice.Level_2;

import java.util.HashSet;
public class length_of_visit {
	public static int solution(String dirs) {
		HashSet<String> hs = new HashSet<>();
        int[] current = {0, 0};
        int[] prev = {0, 0};
        
        for(int i=0; i<dirs.length(); i++) {
            prev[0] = current[0];
            prev[1] = current[1];
            
            if(dirs.charAt(i) == 'U') {
                if(current[1] == 5) continue;
                current[1]++;
            }
            else if(dirs.charAt(i) == 'D') {
                if(current[1] == -5) continue;
                current[1]--;
            }
            else if(dirs.charAt(i) == 'R') {
                if(current[0] == 5) continue;
                current[0]++;
            }
            else if(dirs.charAt(i) == 'L') {
                if(current[0] == -5) continue;
                current[0]--;
            }
            
            hs.add(prev[0]+"/"+prev[1]+"<->"+current[0]+"/"+current[1]);
            hs.add(current[0]+"/"+current[1]+"<->"+prev[0]+"/"+prev[1]);
        }
        return hs.size()/2;
    }
	public static void main(String[] args) {
		System.out.println(solution("ULURRDLLU"	));
	}

}
