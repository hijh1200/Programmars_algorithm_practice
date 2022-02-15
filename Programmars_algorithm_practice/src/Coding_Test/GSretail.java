package Coding_Test;

import java.util.Arrays;

public class GSretail {
	public static int min = 10000;
	public static int n = 0;
	public static int m = 0;
	public static void go(char[][] newmap, int x, int y, int time, boolean[][] visit) {
        visit[x][y] = true;
        if(time >= min) return;
        if(x==n-1 && y==m-1) min = time;

        if((x+1<n && y+1<m)
        		&& !visit[x+1][y+1]
        		&& newmap[x+1][y+1] == '.' 
        		&& newmap[x][y+1]=='.' && newmap[x+1][y]=='.') {
        	go(newmap, x+1, y+1, time+1, visit);
        }
        if((y+1<m)
        		&& !visit[x][y+1]
        		&& newmap[x][y+1] == '.') {
        	go(newmap, x, y+1, time+1, visit);
        }
        if((x+1<n)
        		&& !visit[x+1][y]
        		&& newmap[x+1][y] == '.') {
        	go(newmap, x+1, y, time+1, visit);
        }
    }

    public static int solution(String[] worldmap) {
        char[][] newmap = new char[worldmap.length][worldmap[0].length()];
        for(int i=0; i<newmap.length; i++) newmap[i] = worldmap[i].toCharArray();
        for(int i=0; i<newmap.length; i++) System.out.println(Arrays.toString(newmap[i]));

        boolean[][] visit = new boolean[newmap.length][newmap[0].length];
        n = newmap.length;
        m = newmap[0].length;
        
        go(newmap, 0, 0, 0, visit);
        return min;
    }
	public static void main(String[] args) {
		String[] worldmap = {
				"....",
				"..X.",
				"..X.",
				"XX..",
		};
		System.out.println(solution(worldmap));

	}

}
