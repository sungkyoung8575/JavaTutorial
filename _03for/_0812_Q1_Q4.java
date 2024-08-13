package _03for;

public class _0812_Q1_Q4 {

	public static void main(String[] args) {
//		오늘 문제는 for문 하나로 코드를 작성하는 정리 문제입니다.

//		고등어조 : 김성경 이현건 이찬 강한별

//		제출은 파워포인트로제출합니다.
//		문제 > 조별 해결한 문제 > 리팩토리한 문제(이유 첨부)
//
//		----- 미션 -----------------------
//
//		0 선택받은너
//		int[] letter={8,12,4,13,2,14,4,5}
//		짝수만 출력하시오.
		int[] letter={8,12,4,13,2,14,4,5};
//
		for(int i=0;i<letter.length;i++) {
			if(letter[i]%2==0) {
				System.out.println("0번/"+letter[i]);
			}
		}
		
//		1 큰놈
//		int[] letter={8,12,4,13,2,14,4,5}
//		배열의 가장 큰수가 있는 인덱스를 출력하시오.
//
		int max=0; int maxIndex=0;
		for(int i=0;i<letter.length;i++) {
			if(letter[i]>max) {
				max=letter[i];
				maxIndex=i;
			}
		}
		System.out.println("1번/"+maxIndex);
		
//		2 현상수배
//		int[] letter={8,12,4,13,25,14,4,5}
//		범인을찾으시오
//		범인은 짝수이면서 가장큰 값이다.  letter[i]%2==0 ,max1<
//		범인은 14입니다. 
		int maxEven=0;
		for(int i=0;i<letter.length;i++) {
			if(letter[i]%2==0 && letter[i]>maxEven) {
				maxEven=letter[i];
			}
		}
		System.out.println("2번/"+maxEven);
		
//
//		3 비밀편지
		String word ="gehoudfkimjnlvy";
		int[] letter1={8,12,3,13,1,14,3,4};
//		letter  배열은 word문자열 알파벳의 위치이다.
//		letter배열의 암호를 풀어서 편지의 내용을 출력하시오. 
//
		for(int i=0; i<letter1.length;i++) {
			System.out.print(word.charAt(letter1[i]));
		}
		System.out.println();
		
//		4 난건물주
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size=2;
//		arr 배열에서 0이 의미하는 것은 공터이다. 
//		size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
//		size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
//		size가 2일경우에 7개이다. 
		/*
		 * for(i=0;i<arr.length;i++)
		 * -공터인지 아닌지 ->arr[i]==0
		 * 맞으면 카운팅 / 아니면 초기화
		 * 
		 */
		int cnt=0;
		int cnt1=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				cnt++;	
				
			}else {
				cnt=0;
			}
			if(cnt>=size) {
				cnt1++;
			}
		}
		System.out.println("4번/"+cnt1);
		


		
		


	}

}
