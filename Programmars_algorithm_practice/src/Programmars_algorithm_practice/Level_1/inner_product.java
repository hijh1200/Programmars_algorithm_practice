package Programmars_algorithm_practice.Level_1;

public class inner_product {
	public static int solution(int[] a, int[] b) {
       int answer = 0;      
       for(int i=0; i<a.length; i++) {
       	answer = answer + a[i]*b[i];
       }      
       return answer;
   }

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		System.out.println(solution(a,b));
	}

}
