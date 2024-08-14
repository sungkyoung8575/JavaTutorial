package _04_Random;

import java.util.Scanner;

public class _0814_Q0 {

	public static void main(String[] args) {
// 0. 키보드로 숫자 한 개를 입력 받아서 홀짝을 출력하는 프로그램을 작성하세요.
		

		Scanner in = new Scanner(System.in);
		int k = in.nextInt();		// nextInt는 키보드로 숫자만 가져온다.
		in.nextLine();	
			if(k%2==0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
	}

}
