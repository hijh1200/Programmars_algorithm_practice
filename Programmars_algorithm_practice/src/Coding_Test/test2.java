package Coding_Test;
public class test2 {
	
	public static int winner(char x, char y, char z) {
		if(x == 'S') {
			if(y == 'S') {
				if(z == 'R') return 3;
				if(z == 'P') return 12;
			}
			if(y == 'R') {
				if(z == 'S') return 2;
				if(z == 'R') return 23;
			}
			if(y == 'P') {
				if(z == 'S') return 13;
				if(z == 'P') return 1;
			}
		}
		
		if(x == 'R') {
			if(y == 'S') {
				if(z == 'S') return 1;
				if(z == 'R') return 13;
			}
			if(y == 'R') {
				if(z == 'S') return 12;
				if(z == 'P') return 3;
			}
			if(y == 'P') {
				if(z == 'R') return 2;
				if(z == 'P') return 23;
			}
		}
		
		if(x == 'P') {
			if(y == 'S') {
				if(z == 'S') return 23;
				if(z == 'P') return 2;
			}
			if(y == 'R') {
				if(z == 'R') return 1;
				if(z == 'P') return 13;
			}
			if(y == 'P') {
				if(z == 'S') return 3;
				if(z == 'R') return 12;
			}
		}
		return 0;
	}
	
	public static int[] solution(String[] rsp3) {
		
		int[] point = new int[3];	//누적 점수
		
		for(int i=0; i<rsp3.length; i++) {
			char A = rsp3[i].charAt(0);	
			char B = rsp3[i].charAt(1);	
			char C = rsp3[i].charAt(2);
			if((A != B && B != C && A != C)  ||  (A == B && B == C)) {
				continue;
			}
			
			int w = winner(A, B, C);
			if(w < 10) {
				point[w-1] += 2;
			}
			else if(w > 10) {
				int w1 = w/10;
				int w2 = w%10;
				if(point[w1-1] == point[w2-1]) {
					point[w1-1]++;
					point[w2-1]++;
				}
				else if(point[w1-1] > point[w2-1]) {
					point[w2-1] += 2;
				}
				else {
					point[w1-1] += 2;
				}
			}
			
		}
		return point;
	}
	
	public static void main(String[] args) {
		String[] rsp3 = {"SPR","PPR","PSS","RSS","RRR"};
		System.out.println(solution(rsp3));
	}

}
