package _03for;

public class _00Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		   9. 피보나치 수열 2
//		   i를 피보나치 수로 정의한다.
//		   i의 변화는 1 1 2 3 5 8 13 이 된다.
//		   for(int i=1;i < 20; ){  		
	//}
			int bint =0;		//이전피보나치수
			int temp =0;
			for(int i=1;i<20;) {
				System.out.println(i);
				temp=i;
				i=bint+i;
				bint=temp;
			}
		   
//		   10. 987654321이라는 숫자가 있다.. 변수2개와 for문 한개로
//		   모든 자릿수를 더한 합을 구하시오.. 9+8+7+6+5+4+3+2+1 = 합
//		   합만 출력하면 됩니다.
//		   main메서드 안의 라인수를 최소화 하여서 작성하세요. 최소 라인수로 작성하라는 의미입니다.
			
			int a =987654321;
			int sum =0;
			for(;a>0;) {
				sum = sum+a%10;
				a = a/10;
			}
			
	}

}
