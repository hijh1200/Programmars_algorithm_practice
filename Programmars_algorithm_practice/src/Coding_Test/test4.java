package Coding_Test;

import java.util.Arrays;

public class test4 {
	// 승자의 번호 반환 함수
	public static String victory(char a, char b, char c) {
		// 비길 경우
		if(a == b && b == c) return "";
		if(a != b && b != c && a != c) return "";
		//
		if(a=='R') {
				if(b=='R') {
							if(c=='S') return "12";
							if(c=='P') return "3";
				}
				else if(b=='S') {
							if(c=='R') return "13";
							if(c=='S') return "1";
				}
				else if(b=='P') {
							if(c=='R') return "2";
							if(c=='P') return "23";
				}
		}
		//
		else if(a=='S') {
				if(b=='R') {
							if(c=='R') return "23";
							if(c=='S') return "2";
				}
				else if(b=='S') {
							if(c=='R') return "3";
							if(c=='P') return "12";
				}
				else if(b=='P') {
							if(c=='S') return "13";
							if(c=='P') return "1";
				}
		}
		//
		else if(a=='P') {
				if(b=='R') {
							if(c=='R') return "1";
							if(c=='P') return "13";
				}
				else if(b=='S') {
							if(c=='S') return "23";
							if(c=='P') return "2";
				}
				else if(b=='P') {
							if(c=='R') return "12";
							if(c=='S') return "3";
				}
		}
		return "";
	}
	
	public static int[] solution(String[] rsp3) {
		int[] score = new int[3];	// 1,2,3번  사람 누적 점수
		
		for(int i=0; i<rsp3.length; i++) {
			String v = victory(rsp3[i].charAt(0), rsp3[i].charAt(1), rsp3[i].charAt(2));
			if(v.equals("")) continue;	// 비길 경우
			
			// 승자가 1명일 경우
			if(v.length() == 1) score[(v.charAt(0) - '0') - 1] += 2;
			
			// 승자가 2명일 경우
			else if(v.length() == 2) {
				int w1 = (v.charAt(0) - '0') - 1;
				int w2 = (v.charAt(1) - '0') - 1;
				
				if(score[w1] == score[w2]) {
					score[w1] += 1;
					score[w2] += 1;
				}
				else if(score[w1] > score[w2]) score[w2] += 2;
				else if(score[w1] < score[w2]) score[w1] += 2;
			}
		}
        return score;
    }
	public static void main(String[] args) {
		String[] rsp3 = {"RRR", "SPS"};
		System.out.println(Arrays.toString(solution(rsp3)));
	}

}
