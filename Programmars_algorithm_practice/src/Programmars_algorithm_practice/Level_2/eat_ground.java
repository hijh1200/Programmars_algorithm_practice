package Programmars_algorithm_practice.Level_2;

public class eat_ground {
	public static int solution(int[][] land) {
        for(int i=1; i<land.length; i++) {
            land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
            land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
            land[i][2] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][3]);
            land[i][3] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][2]);
        }
        int len = land.length - 1;
        return Math.max(Math.max(land[len][0], land[len][1]), Math.max(land[len][2], land[len][3]));
    }
	public static void main(String[] args) {
		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		System.out.println(solution(land));
	}

}
