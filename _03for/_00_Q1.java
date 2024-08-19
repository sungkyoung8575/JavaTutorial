package _03for;

public class _00_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 1부터 100까지 숫자 중 홀수는 더하고 짝수는 뺀 결과값 1개를 출력하시오.
		
		int sum =0;
		for(int i=1; i<101;i++) {
			if(i%2 ==1) {
				sum += i;
			}else {sum -= i;}
			}
		System.out.println("1번"+sum);
		
//		
//		2. 1부터 100까지 숫자 중 홀수는 홀수끼리 더한 값을 짝수는 짝수끼리 더한 값을 각각출력하시오.
		int sumOdd =0;	//홀수 합
		int sumEven =0;		//짝수 합
		for(int i=1; i<101 ;i++) {
			if(i%2==1) {
				sumOdd += i; 
			}else {sumEven += i;}
	}
		System.out.println("2번"+"홀수합"+sumOdd+"짝수합"+sumEven);
			
		
//		3. 1부터 100까지 숫자 중 홀수는 모두 몇개인가?
		int cnt =0;
		for(int i=1; i<101 ;i++) {
			if(i%2==1) {
				cnt++;
			}
		}
		System.out.println("3번"+cnt);
		

		    
//	    5. 범인은 100부터 999까지 숫자에 숨어 있다.
//	    범인은 십의 자리에 있고. 3의 배수이다. 범인 숫자를 모두 출력하시오.
		
		int temp=0;  // 선언문은 메모리를 할당하므로 한 번만 선언하는 것이 좋다.
		for(int i=100; i< 1000; i++) {
			temp = i/10;
			temp = temp%10;
			if(temp>0&& temp % 3 == 0) {
				System.out.println("범인 : "+i);
			}
		}
//	    
//	    6. 범인을 찾아라. 0부터 100까지 숫자중 하나이다. 0부터 1 2 3 순서대로 합한 값을
//	    누적한다. 합한 값이 44를 넘어가게 하는 숫자 한개가 범인이다.
//	    범인 숫자 한 개를 출력하시오.. (단, break사용하지 않는다) 
		int sum3 =0;
		for(int i=0;i<101;i++) {
			sum3 += i; 
			if(sum3 > 44) {
				System.out.println("6번"+i);
				i=101;		//for문 종료하게 하기 ///////***********
			}
		}
		
		
//	    7. System.out.println("abc");  
//		   System.out.println("def"); 
//		   // 위코드를 실행하면
//		   abc
//		   def
//
//		   System.out.print("abc");    // ln이 빠지면 i변수 값을 출력 후 줄바꿈을 하지 않는 코드이다. 
//		   System.out.print("def"); 
//		   // 위코드를 실행하면
//		    abcdef
//
//		   문제>> 다음과 같이 출력하게 하시오.
//		   1+2+3+4+5+6+7+8+9+10=결과값 
		System.out.print("7번");
		int sum4 =0;
		for(int i=1;i<11;i++) {
			sum4+=i;
			if(i<10) {
				System.out.print(i+"+");
			}else {
				System.out.print(i+"="+sum4);
			}
				}
		
//		   
//	   8. 피보나치 수열 1
//	   i는 피보나치 수의 갯수이다.   총 8개의 피보나치 수를 구하고 합한 값을
//	   출력하시오. 
//	   i는 1 2 3 4 5 6 7 까지 증가, i가 4일 때 피보나치 수는 3이 된다.
//
//	    int fib=1;  // 파보나치 수   1 1 2 3 5 8 13
//	    for(int i=1;i < 8; i++){  // 피보나치 수의 개수 i  
//	    
//	    }
//	   결과 : 1 + 1 + 2 +3 + 5 + 8 + 13 = 합한 값
			   

		
	}
}
