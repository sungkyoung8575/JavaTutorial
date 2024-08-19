package _04_Random;

import java.util.Random;

public class _0814_Q3 {

	public static void main(String[] args) {
//3. 2번 업그레이드, 랜덤 수를 하나 뽑아서 출력한다
//  7의 배수이면 행운의 숫자, 7의 배수가 아니면 행운의 숫자가 나올 때 까지 계속 뽑는다.
		
		Random r = new Random();
		int num = r.nextInt(100)+1;
		
		System.out.println(num);
		for(;;) {
		if(num%7==0) {
			System.out.println("행운의숫자"+num);
			break;			
		}else {
			int newNum =r.nextInt(100)+1;	// 7의배수가 아닐때 새로운 숫자뽑기
			System.out.println(newNum);
			num=newNum;
		}
		
		}
		

	}

}
