package _08_Array2;

public class _0910_2차원배열_문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//문제6. 2차원 배열의 모든값을 출력하시오, 출력할 때는 행의번호는 내림차순, 열의 번호도 내림차순으로 출력하시오
	int[][] a= {{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};		
		
		for(int i=4;i>=0;i--) {
			for(int j=4;j>=0;j--) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
//		혼자풀때 i를 4로 했음 아쉬움  밑에 선생님풀이참조
		
//		for (int i = a.length-1; i >= 0; i--) {
//			for (int j = a[i].length-1; j >= 0; j--) {
//				System.out.print(a[i][j] + "\t");
//			}
//			System.out.println();
//		}

		
		
		
		
		
	}

}
