package _08_Array2;

public class _0910_2차원배열_문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 문제1. 2차원 배열 a의 2번째 행의 모든 값을 출력하시오
		int[][] a= {{1,2,3,4,5},
					{6,7,8,9,10},
					{11,12,13,14,15},
					{16,17,18,19,20},
					{21,22,23,24,25}};
		
		for(int i=0; i<a[1].length; i++) {
			System.out.print(a[1][i]+"\t");
		}
		
		
		/*
		 * a의 2번째행 -> a배열에 1번인덱스의 모든값 출력하기
		 * for문으로 a[1] 자리에 있는 배열 순회해서 값 출력햇음
		 */
		
	}

}
