package _03for;

public class _0809_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//-----------------------------------------------------------------------------------------------------------------
//		이 문제는 응용문제입니다. 할 수 있습니다. 풀어 봅시다~~
//		변수, 연산자, 조건문, 반복문을 생각하면 해결 할 수 있습니다. 
//		9.  String test = "abcdeabce";   => 선언문(자료형 변수=초기값) : 변수는 test,변수는 문자열,초기문자열"~"
//	    for(int i=0; i < 9; i ++){
//	    	char aaa = test.charAt(i);
//	    	sysout(aaa);
//	        }//
//		   위 코드를 분석하여 a문자열에 a가 몇개 있는지 구하는 프로그램을 작성하세요
		int cnt=0;
		String test = "abcdeabce";
		    for(int i=0; i < 9; i ++){
			char aaa = test.charAt(i);
				if(aaa=='a') {
					cnt++;
				}
		    }
		    System.out.println(cnt);

//------------------------------------------------------------------------------------------------------------------
//여기부터는 어렵습니다.
//
//10.  int[] arr = {45,23,25,64,3,24,48} 
//   배열에서 가장 큰 값과 가장 큰 값이 있는 인덱스를 출력하시오.
		    // 
		    
		int[] arr = {45,23,25,64,3,24,48};
		int max=0;
		int maxindex=0;
		for(int i=0;i<7;i++) {
			if(arr[i]>0) {
				max=arr[i];
				maxindex=i;
			}
		}
	System.out.println(max+","+"arr["+maxindex+"]");
//
//11. 범인 숫자 구하기.. 
//  범인은 100부터 999까지 숫자중에 여러명이다. 
//  범인의 특징은 숫자의 각자릿수를 더한 값이 짝수이다.  범인의 숫자를 모두 찾으시오.
	int temp=0;
	int sum1=0;	
	for(int i=100;i<1000;i++) {
		temp=i;
		sum1 += temp%10;
		temp /= 10;
		sum1 += temp%10;
		temp /= 10;
		sum1 += temp;
		if(sum1%2==0) {
			System.out.println(sum1);
		}
		sum1=0;
		}
	
//12. int[] arrA = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3}
//   0은 터널이다. 가장 긴 터널의 길이를 구하시오.
	
//	 1.for문으로 배열을 순회
//	 	-초기값 0 ~ 0<배열의길이 i++
//	 	-i를 배열의 index
//	 2.현재터널 arr[i]
//		-터널인지 아닌지 ->arr[i]==0
//			-참 -> 카운팅->변수생성
//			-거짓 ->카운팅 초기화
//	 3.제일 긴터널의 길이를 저장
//	 	-
	int cntA=0; 
	int maxLength =0;
	int[] arrA = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,0,0};
	for(int i=0;i<arrA.length;i++) {
		if(arrA[i]==0) {
			cntA++;
		}else {
			cntA=0;
		}
		if(cntA >maxLength) {
			maxLength=cntA;
		}
	}
	System.out.println("12번답"+maxLength);
	

//13. int[] arrB = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,2,0,0,0,0,0,3,3}
//숫자는 터널의 번호이다. 터널의 길이가 가장 긴 숫자와 길이를 출력하시오.   
	// 연속된 터널인지 판단-> 변수선언필요
	//	- arr[i]==bT
	
	int[] arrB = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,2,0,0,0,0,0,3,3};
	int cntB=0;
	int bT=arrB[0]; //이전터널값 비교
	int maxLengthB=0;
	int maxIndexB=0;
	for(int i=0;i<arrB.length;i++) {
		if(arrB[i]==bT) {
			cntB++;
		}else {
			cntB=0;
			bT=arrB[i];
		}
		if(maxLengthB<cntB) {
			maxLengthB=cntB;
			maxIndexB=bT;
		}
	}
	System.out.println(maxLengthB+"/"+maxIndexB);
		
	}

}
