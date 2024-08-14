package _04_Random;

import java.util.Scanner;

public class _0814_Q1 {

	public static void main(String[] args) {
// 1. 키보드로 두 개의 숫자를 입력받아서 합하는 프로그램을 작성하세요.
		
		Scanner in = new Scanner(System.in);
		int sum =0;
		for(int i=0;i<2;i++) {
			System.out.println((i+1)+"번 입력하세요");
		int k = in.nextInt();		// nextInt는 키보드로 숫자만 가져온다.
		in.nextLine();	
		sum += k;
		}
		System.out.println("합계"+sum);
		

	}

}
