package _08_Array2;

public class _0910_2차원배열_문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 문제2. 2차원 배열 a의 3번째 행에서 짝수의 값만 출력하시오
		int[][] a= {{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};
		
		for(int i=0;i<a[2].length;i++) {
			if (a[2][i]%2==0) {
				System.out.print(a[2][i]+"\t");
			}
		}
		
		
		/*
		 * a의 3번째 행 => a[2] 자리에 있는 배열중에 짝수만 찾기
		 * for문으로 a[2] 에 배열 순회하고 if문으로 짝수라면 출력하기
		 */
		
		
		
	}

}
