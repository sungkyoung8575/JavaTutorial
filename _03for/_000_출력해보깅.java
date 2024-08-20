package _03for;

public class _000_출력해보깅 {
	public static void main(String[] args) {


		//분석.. 건물을 지을 수 있는 배열의 인덱스는 1,2/ 2,3 /7,8/ 8,9/ 9,10
		// 이렇게 패턴이 이어 지는 군
		// 배열의 현재 i의 인덱스의 값과 하나 증가한 i의 인덱스의 값이 모두 0이라면 가능하군
		// 먼저 배열을 순회하자..
		// 배열을 순회할때는 마지막 배열의 값은 순회할 필요가 없다. 위의 규칙에  따르면 그렇다.

		
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size=2;
		int totalCnt=0;
		int cnt=0;
		for(int i=0; i < arr.length; i++) {
			cnt=0;
			for(int j=i; j < arr.length; j++) {
				if(arr[j]==0) {
					cnt++;
				}else {
					break;
				}
			}
			if(cnt >= 3) {
				System.out.println(i+"위치의 0은 오른쪽으로 "+cnt+"개 연속입니다");
				totalCnt += (cnt%3+1);
				i += 3-1;
			}
		}
	
		System.out.println(totalCnt);
		
		
		
		
	}
}
