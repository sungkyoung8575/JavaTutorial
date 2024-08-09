package _03for;

public class _0809_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//-----------------------------------------------------------------------------------------------------------------
//		이 문제는 응용문제입니다. 할 수 있습니다. 풀어 봅시다~~
//		변수, 연산자, 조건문, 반복문을 생각하면 해결 할 수 있습니다. 
//		9.  
		int cnt=0;
		String test = "abcdeabce";
		    for(int i=0; i < 9; i ++){
			char aaa = test.charAt(i);
				if(aaa=='a') {
					cnt++;
				}
		    }
		    System.out.println(cnt);
//
//		   위 코드를 분석하여 a문자열에 a가 몇개 있는지 구하는 프로그램을 작성하세요
		
		System.out.println("모름");
		
//------------------------------------------------------------------------------------------------------------------
//여기부터는 어렵습니다.
//
//10.  int[] arr = {45,23,25,64,3,24,48} 
//   배열에서 가장 큰 값과 가장 큰 값이 있는 인덱스를 출력하시오.
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
	
//12. int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3}
//   0은 터널이다. 가장 긴 터널의 길이를 구하시오.
	
//	int[] arr1 = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
//	System.out.println(arr1.length);		//22
//	for(int i=0;i<22;i++) {
//		if
//	}
	

//13. int[] arr = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,2,0,0,0,0,0,3,3}
//숫자는 터널의 번호이다. 터널의 길이가 가장 긴 숫자와 길이를 출력하시오.   
//
//
//14. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요
// String ttt ="aabbbcccaaaaddbbbaaaaa";
//
//
//15.  String ttt ="aabbbcccaaaaddbbbaaaaa";
//   압축하시오. 압축 하는 방법 a2b3c3a4d2b3a5
//				
		
		
	}

}
