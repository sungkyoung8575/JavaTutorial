package _08_Array2;

public class _0910_2차원배열_문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//문제5. 전체 배열의 값 중 홀수를 0으로 마스킹하고 마스킹 된 결과 2차원배열을 출력하시오
/*	출력은
	02040
	608010
이와같은 패턴으로 모두 출력되어야 한다 */
		
		int[][] a= {{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};		
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++){
				if (a[i][j]%2==1) {		// 홀수라면 0으로 마스킹
					a[i][j]=0;
				}
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		/*
		 * 행과 열 모두 순회해서 홀수 라면 해당값을 0으로 바꿔줌
		 */
		
	}

}
