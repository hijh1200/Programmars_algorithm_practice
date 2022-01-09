package Coding_Test;
import java.util.*;
public class test {
	public static int[] solution(int[] arr1, int[] arr2) {
        String[] str1 = new String[arr1.length];
        String[] str2 = new String[arr2.length];
        for(int i=0; i<arr1.length; i++) {
            str1[i] = Integer.toString(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++) {
            str2[i] = Integer.toString(arr2[i]);
        }
        int[] answer = new int[arr2.length];

        for(int i=0; i<arr2.length; i++) {
            int res = 0;
            for(int j=0; j<arr1.length; j++) {
                int cnt = 0;
                for(int k=0; k<6; k++) {
                    if(!str2[i].substring(k,k+1).equals(str1[j].substring(k,k+1))) {
                        cnt++;
                    }
                }
                if(cnt == 1) {
                    res++;
                }
            }
            answer[i] = res;
        }
        return answer;
    }

	public static void main(String[] args) {
		int[] arr1 = {123456, 111111, 111113, 111114, 222222, 333333};
		int[] arr2 = {123455, 111112, 222223, 333334};
		System.out.println(Arrays.toString(solution(arr1, arr2)));
	}

}
