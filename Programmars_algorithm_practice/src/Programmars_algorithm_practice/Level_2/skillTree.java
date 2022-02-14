package Programmars_algorithm_practice.Level_2;

public class skillTree {
	public static int solution(String skill, String[] skill_trees) {
int cnt = 0;
        
        for(int i=0; i<skill_trees.length; i++) {
            boolean check = true;
            int idx = 0;
            
            for(int j=0; j<skill_trees[i].length(); j++) {
                if(!skill.contains(skill_trees[i].charAt(j)+"")) continue;
                else {
                    if(skill.charAt(idx) == skill_trees[i].charAt(j)) idx++;
                    else {check = false; break;}
                }
            } if(check) cnt++;
        }
        return cnt;
    }
	public static void main(String[] args) {
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		System.out.println(solution("CBD",skill_trees));
	}

}
