package _09_Array2;

public class _0913_문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1번부터 5번까지의 선언문 

		int[][] a= {{1,2,3,4,5},
					{6,7,8,9,10},
					{11,12,13,14,15},
					{16,17,18,19,20},
					{21,22,23,24,25}};
		
		// 배열 값 입력부
/*		
 		현재배열				=>		변경배열				
		1	2	3	4	5		6	1	2	3	4
		6	7	8	9	10		11	12	7	8	5
		11	12	13	14	15		16	17	13	9	10
		16	17	18	19	20		21	18	19	14	15
		21	22	23	24	25		22	23	24	25	20
*/		
		
		// 여기에 문제풀기 
		
		
		
		
		
		
		
		//배열값 출력부
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
