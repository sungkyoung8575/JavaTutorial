package _08_Array2;

public class _0913_문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1번부터 5번까지의 선언문 
		int[][] a= new int[4][5];
		int num=1;
//문제5		
		// 배열 값 입력부
/*		1	2	3	4	5	
		14	15	16	17	6
		13	20	19	18	7
		12	11	10	9	8
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
