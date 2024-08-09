package _03for;

public class _0809_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//오늘의 목표는 1번부터 8번까지 입니다. 
//
//1. 100부터 999까지의 숫자중에서 홀수만 출력하시오.
	int sumOdd =0;
	for(int i=100;i<1000;i++) {
		if(i%2==1) {
			sumOdd += i;
			System.out.println(i);
		}
	}
		
//2. 1부터 100까지 숫자중에서 홀수의 총합을 구하시오.
		
	System.out.println(sumOdd);
		
//3. 다음과 같이 출력하시오   10  9  8  7  6  5  4  3  2  1
	
	for(int i=10;i>0;i--) {
		System.out.println(i);
	}
	
//4. 배열에서 배열의 값이 짝수인 것만 출력하시오.
  int[] arr = {45,23,25,64,3,24,48};
	for(int i=0;i<7;i++) {
		if(arr[i]%2==0) {
			System.out.println(arr[i]);
		}
	}
	
//6.배열에서 배열의 값이 홀수 인 곳의 인덱스만 출력하시오.
//  int[] arr = {45,23,25,64,3,24,48}
	for(int i=0;i<7;i++) {
		if(arr[i]%2==0) {
			System.out.print("arr["+i+"]");
		}
	}
	System.out.println();
	
//7. int[] arr = {45,23,25,64,3,24,48}
//   배열의 값을 모두 더한 총합을 구하시오.
	int sum=0;
	for(int i=0;i<7;i++) {
		sum += arr[i];
	}
	System.out.println(sum);
	
//8. int[] arr = {45,23,25,64,3,24,48}
//   짝수는 모두 몇개인가요?
	int cnt =0;
	for(int i=0;i<7;i++) {
		if(arr[i]%2==0) {
			cnt++;
		}
	}
	System.out.println(cnt);

	}

}
