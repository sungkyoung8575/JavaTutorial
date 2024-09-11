package _08_Array2;

public class _0910_2차원배열_문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//문제4. 전체 배열의 값 중 짝수는 모두 몇 개인가?	
		
		int[][] a= {{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};	
		
		int cnt=0;	// 짝수 찾으면 카운트할예정
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++){
				if (a[i][j]%2==0) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		
		/*
		 * 일단 짝수를 찾으면 카운트 해야함 변수 선언 
		 * 행과 열 모두 순회 >2for /  짝수일때마다 카운트 ++해줌 if
		 */
		
		
	}

}
