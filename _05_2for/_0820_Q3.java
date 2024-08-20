package _05_2for;

public class _0820_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		3. 팩토리얼의 합 구하기 (2중 for로 해결)
//		1부터 10까지 숫자의 각패토리얼의 합을 구하시오
//		예를들어 4의 팩토리얼은  1*2*3*4
//		             5의 팩토리얼은 1*2*3*4*5
		
		int sum =1;
		int total=0;
		for(int i=1;i<=10;i++) {
//			System.out.print(i);
			sum=1;
			for(int j=1;j<=i;j++) {
				sum *= j;
				total += sum;
			}
			System.out.println(i+"팩토리얼 합"+sum);
		}
		
		System.out.println("총합 "+ total);
		
		
		
	}

}
