package _03for;

public class _Q4 {

	public static void main(String[] args) {
//		4. 100부터 999까지의 숫자의 모든 숫자의 합을 구하시오.
	/*	int sum1=0;
		for(int i=100;i<1000;i++) {
			sum1 += i;
		}
		System.out.println("4번"+sum1);		//494550 */
		
//	    453인 경우 4+5+3로 합한 값의 모든 총합을 구하시오.
		//4+9+4+5+5+0 ????
		//잘 모르겠음
		int sum=0;
		int temp=0;
		for(int i=100; i< 1000; i++) {
			temp = i;
			sum += temp%10;
			temp /= 10;
			sum += temp%10;
			temp /= 10;
			sum += temp;			
		}
		System.out.println(sum);

	}

}
