package _04_Random;

import java.util.Random;

public class _0814_Q6 {

	public static void main(String[] args) {
//6. 
//컴퓨터는 랜덤으로 로또 번호를 10000번 뽑는다.
//가장 많이 뽑힌 로또 번호가 오늘의 추천 로또 번호이다.
//오늘의 추천 로또 번호 하나를 출력하시오.  만약 로또 번호가 같은 횟수로 나왔을 경우에는 큰 숫자가 우선한다. 
		
		Random r = new Random();  
		int[] cnt = new int[46];
		int max =0;
		int maxIndex =0;
//		int sum =0;
			
		for(int i=0;i<10000;i++) {
			int num = r.nextInt(45)+1;
			cnt[num]+=1;
		}
		
		for(int i=0;i<cnt.length;i++) {
//			sum+=cnt[i];
			System.out.println(i+"번"+cnt[i]+"개");
			if(cnt[i]>=max) {
				max=cnt[i];
				maxIndex=i;
				
			}
		}
//		System.out.println(sum);		// 10000번 맞는지 확인할라구! 
		System.out.println("제일 큰숫자"+maxIndex+"갯수"+max);

	}

}
