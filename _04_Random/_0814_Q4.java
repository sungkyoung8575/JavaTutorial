package _04_Random;

import java.util.Random;

public class _0814_Q4 {

	public static void main(String[] args) {
//4. . 숫자 10개를 저장할수 있는 배열을 만들고
//   0부터 99숫자중 랜덤으로 10개를 뽑습니다.
//   이중 짝수만 저장하고 홀수는 무시합니다.(다시 뽑지 않습니다.)
//  0번째 번호 98이라면   0번 인덱스에 저장
//  1번째 번호 97이라면   무시  1번 인덱스는 선언시 초기값
//  2번째 번호 88이라면   2번  인덱스에 저장
		
		Random r = new Random();
		int[] a= new int[10];
		
		for(int i=0;i<10;i++) {
			int num = r.nextInt(100);
			if (num%2==0) {
				a[i]= num;
			}
			System.out.print("["+a[i]+"]");
		}

	}

}