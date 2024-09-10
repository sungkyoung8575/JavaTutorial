package _04_Random;

import java.util.Random;

public class _00test { 

	public static void main(String[] args) {
		// 6개의 랜덤한 로또번호를 뽑아서 저장한다.ㄴ
		
		// 로또 번호 저장할 배결	
		int[] lotto = new int[6];		// 변수명, 길이 , 인덱스
		// 램덤한 번호를 추출하기 위한 객체 만들기
		Random r = new Random();		// Ctrl+shift+o
		// 랜덤한 번호를 뽑기 위한 반복문		
		for(int i=0;i<lotto.length;i++) {
//			System.out.println((i+1)+"번째뽑아");
			int k = r.nextInt(45)+1;		// r 변수를 참조하여 nextInt라는 기능을 호출,리턴받은 수에 +1을 한다
			lotto[i]=k;
		}
			// 로또 번호를 출력하는 반복문
		for(int i=0;i<lotto.length;i++) {
			if(i==lotto.length-1) {// 마지막번호
				System.out.println("보너스"+lotto[i]);
			}else {
				System.out.println(lotto[i]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
//--------------------------		
	}

}
