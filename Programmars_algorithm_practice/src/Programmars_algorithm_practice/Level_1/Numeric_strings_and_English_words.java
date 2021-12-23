package Programmars_algorithm_practice.Level_1;
// 숫자 문자열과 영단어
public class Numeric_strings_and_English_words {

	public static int solution(String s) {
		String str = s;
		str = str.replace("one","1");
		str = str.replace("two","2");
		str = str.replace("three","3");
		str = str.replace("four","4");
		str = str.replace("five","5");
		str = str.replace("six","6");
		str = str.replace("seven","7");
		str = str.replace("eight","8");
		str = str.replace("nine","9");
		str = str.replace("zero","0");
	    int answer = Integer.parseInt(str);
        return answer;
    }
	
	public static void main(String[] args) {
		String s = "one4seveneight";
		System.out.println(solution(s));
	}

}
