package Coding_Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class iMarketKorea2 {
	public static int solution(int[] bricks) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: bricks) pq.add(i);
        int h = pq.poll();				// ������ ���� �ִ� ����
        int w = bricks.length;			// ������ ���� �ʺ�
        int[][] map = new int[h][w];	// ������ �־��� �׸�

        for(int i=0; i<bricks.length; i++) {
        	int cnt = bricks[i];
        	while(cnt>0) {
        		map[h-cnt][i] = 1;		// �׸����� ������ 1�� ǥ��
        		cnt--;
        	}
        }
        
        int answer = 0;
        for(int k=h-1; k>=0; k--) {
        	ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<w; i++) if(map[k][i] > 0) list.add(i);
            // �׸����� 1������ h������  �� ���� ������ �ִٸ� ������ ���� �� ����
            if(list.size() > 1) {
            	for(int j=list.get(0); j<list.get(list.size()-1); j++) {
                	if(map[k][j]==0) {	// ������ ���� �� ����
                		answer++;
                	}
        		}
            }
            else break;		// k+1���� ������ 2�� �̸��̸� ���� ���� �� �����Ƿ� �ݺ��� Ż��  
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
