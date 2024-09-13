package _08_Array2;

public class _0913_문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1번부터 5번까지의 선언문 
		int[][] a= new int[4][5];
		int num=1;
//문제2.		
		// 배열 값 입력부
/*		20	19	18	17	16
		15	14	13	12	11
		10	9	8	7	6
		5	4	3	2	1
3,4 3,3 3,2 3,1 3,0		행은 고정  열바뀜 i는 행 j가 열
2,4 2,3 2,2 2,1 2,0
1,4 1,3 1,2 1,1 1,0		

*/		
		// 여기에 문제풀기 
		for(int i=3; i>=0; i--) {
			//System.out.println("행"+i);
			for(int j=4; j>=0; j--) {
				a[i][j] =num;			
				num++;					
			}
		}
		
		
		//배열값 출력부
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
