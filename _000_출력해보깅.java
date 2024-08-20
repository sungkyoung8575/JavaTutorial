

public class _000_출력해보깅 {
	public static void main(String[] args) {


		 /* 8.
		 int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5}   - 이중 for  사용
		 애니팡 게임의 일부분인다. 게임의 캐릭터는 숫자로 구분한다.
		 가로에 같은 캐릭터가 3개 이상이면 제거 대상이다.
		 제거 대상 캐릭터 번호와 갯수, 시작위치 인덱스를 모두 출력하시오.
		  */
		 
		 		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5};
		 		int nowNumber=pang[0];
		 		int cnt=0;
		 		for(int i=0; i < pang.length; i++) {
		 			nowNumber=pang[i];
		 			cnt=0;
		 			for(int j=i; j < pang.length; j++) {
		 				if(nowNumber == pang[j]) {
		 					cnt++;
		 				}else {
		 					break;
		 				}
		 			}
		 			if(cnt >= 3) {
		 				System.out.println(i+"위치의 캐릭터 "+nowNumber+"는 오른쪽으로 "+cnt+"개 연속입니다");
		 				i += 3-1;
		 			}
		 		}
		

	}
}
