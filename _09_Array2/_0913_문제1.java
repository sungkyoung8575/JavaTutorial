package _09_Array2;

public class _0913_문제1 {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		
		// 1번부터 5번까지의 선언문 
		
		int[][] a= new int[4][5];
		int num=1;
		
//문제1.		
		// 배열 값 입력부
/*		17	13	9	5	1
		18	14	10	6	2
		19	15	11	7	3
		20	16	12	8	4
	좌표	
	0.4 1.4 2.4 3.4		행이 변하고 열이 고정  i는 열 j 행
	0.3 1.3 2.3 3.3
	0.2 1.2 2.2 3.2...	
	
*/		
		// 여기에 문제풀기   
		for(int i=4;i>=0;i--) {
			//System.out.println(i);
			for(int j=0;j<4;j++) {
				//System.out.println("열"+i+"행"+j);
				a[j][i]=num++;
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
