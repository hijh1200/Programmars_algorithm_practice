package Coding_Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class iMarketKorea2 {
	public static int solution(int[] bricks) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: bricks) pq.add(i);
        int h = pq.poll();				// 벽돌이 쌓인 최대 높이
        int w = bricks.length;			// 벽돌이 쌓인 너비
        int[][] map = new int[h][w];	// 문제의 주어진 그림

        for(int i=0; i<bricks.length; i++) {
        	int cnt = bricks[i];
        	while(cnt>0) {
        		map[h-cnt][i] = 1;		// 그림에서 벽돌은 1로 표시
        		cnt--;
        	}
        }
        
        int answer = 0;
        for(int k=h-1; k>=0; k--) {
        	ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<w; i++) if(map[k][i] > 0) list.add(i);
            // 그림에서 1층부터 h층까지  양 옆에 벽돌이 있다면 빗물이 고일 수 있음
            if(list.size() > 1) {
            	for(int j=list.get(0); j<list.get(list.size()-1); j++) {
                	if(map[k][j]==0) {	// 빗물이 고일 수 있음
                		answer++;
                	}
        		}
            }
            else break;		// k+1층에 벽돌이 2개 미만이면 물이 고일 수 없으므로 반복문 탈출  
            list.clear();
        }
        
        for(int i=0; i<h; i++) System.out.println(Arrays.toString(map[i]));
        System.out.println();
        
        return answer;
    }
	public static void main(String[] args) {
		int[] bricks = {0, 2, 0, 1, 3, 1, 2, 0, 1, 0, 2, 0};
		System.out.println(solution(bricks));
	}

}
