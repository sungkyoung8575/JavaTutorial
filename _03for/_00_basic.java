package _03for;

public class _00_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {30,40,50,55,65};
		
		////////////////////////////////////////
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}

		//문제1. 65 55 50 40 30  순서로 출력
		for(int i=4;i>=0;i--) {
			System.out.println(a[i]);
		} 
		
		//문제2. 40 50 55 65 30  순서로 출력
		
//		for(int i=1;i<=5;i++) {
//			System.out.println(a[i%5]);
//		}
		for(int i=0; i<=4; i++) {
			System.out.println(a[(i+1)%5]);
		}
		
		
		// 50이상만 출력하기 / (배열순회를 반복하면서 값의 조건판단후 출력)
		for(int i=0; i<5; i++) {
			if(a[i]>=50) {
				System.out.println(a[i]);
			}
		}
		// 50이상 점수는 몇개인가?
		int cnt = 0;
		for(int i=0; i<5; i++) {
			if(a[i]>=50) {
				System.out.println(a[i]);
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
		System.out.println("---------------------");
		//문제3. 50점 이상 점수를 합하시오
		int sum=0;
		int cnt1=0;
		for(int i=0; i<5; i++) {
			if(a[i]>=50) {
				sum +=a[i];
				cnt1++;
			}
		}
		System.out.println(sum+"/"+cnt1);
		
		System.out.println("---------------------");
		//문제4. 평균을 구하시오. 단, 50점 이상만
		
		System.out.println((double)sum/cnt1);
		
		System.out.println("---------------------");
		//문제5. 평균을 구하시오. 단, 최저점수는 포함하지 마시오
		int sum2=0;
		int cnt2=0;
		int min=1000;  //  최저값찾기
		for(int i=0; i<5; i++) {
			sum2 +=a[i];
			cnt2++;
			if(min >= a[i]) {
				min=a[i];
			}
		}
		System.out.println((double)(sum2-min)/(cnt2-1));

		
		
	}

}
