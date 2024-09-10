package _06_2For_;

public class _03_Q {
//팩토리얼의 합 구하기 (2중 for로 해결)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int fmul=1;
		for(int i=1; i<= 10; i++) {
			fmul=1;
			for(int j=i; j>=1; j--) {
				fmul *= j;
			}
			System.out.println(i+"일 때 팩토리얼 : "+fmul);
			sum += fmul;
			
		}
		System.out.println("팩토리얼 총합 : "+sum);

	}

}
