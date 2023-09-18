package pkg;

import java.util.Scanner;

public class Main {

	public String solution(String str) {
		String answer = "";
		
		int cnt = 1;
		
		str = str + " ";
		
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) cnt++;
			else {
				answer += str.charAt(i);
				if(cnt > 1) {
					answer += String.valueOf(cnt);
					cnt = 1;
				}
			}
				
			
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		System.out.println(T.solution(str));
	}

}
