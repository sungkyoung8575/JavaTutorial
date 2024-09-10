package _06_2For_;

import java.util.Scanner;

public class _07_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/**
 * 키보드로 아이디를 입력 받는다.
입력 받은 아이디에 특수문자가 포함되었는지 확인한다. (유효성)
특수문자는 String sign="!@#$%^&*"로 정의한다.
특수문자가 몇 개 포함되었는지 출력합니다. 
 * 
 */	
		String sign="!@#$%^&*";
		Scanner in = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String id = in.nextLine();
		
		int cnt=0;
		for(int i=0; i < sign.length(); i++) {
			for(int j=0; j < id.length(); j++) {
				if(sign.charAt(i)==id.charAt(j)) {
					cnt++;
				}
			}
		}
		System.out.println(id +"문자열에는 특수문자가 "+cnt+"개 있습니다.");
	}

}
