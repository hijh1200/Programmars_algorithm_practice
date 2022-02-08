package Programmars_algorithm_practice.Level_2;

public class fatigue {
	public static int max = 0;
	public static void search(int k, int[][] dungeons, boolean[] visit, int cnt) {
		for(int i=0; i<dungeons.length; i++) {
			if(k >= dungeons[i][0] && !visit[i]) {
				k -= dungeons[i][1];
				visit[i] = true;
				search(k, dungeons, visit, cnt+1);
				visit[i] = false;
				k += dungeons[i][1];
			}
		}
		if(max < cnt) max = cnt;
	}
	public static int solution(int k, int[][] dungeons) {
        boolean[] visit = new boolean[dungeons.length];
		search(k, dungeons, visit, 0);
		
		return max;
    }
	
	public static void main(String[] args) {
		int[][] dungeons = {{80,20},{50,40},{30,10}};
		System.out.println(solution(80, dungeons));
	}

}
