package _09_Array2;

public class _0913_문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1번부터 5번까지의 선언문 
		int[][] a= new int[4][5];
		int num=1;
//문제3.		
		// 배열 값 입력부
/*		1	2	3	4	5
		10	9	8	7	6
		11	12	13	14	15
		20	19	18	17	16
0,0 0,1 0,2 0,3 0,4			행은고정 열은변화 
1,4 1,3 1,2 1,1 1,0			행이 먼저 반복되고 후에 열이 반복
2,0 2,1 2,2 2,3 2,4			행 = i , 열 = j
3,4 3,3 3,2 3,1 3,0			행이 짝수이면 0 1 2 3 4
							행이 홀수이면 4 3 2 1 0		>> if문으로 나누자

*/
		
		// 여기에 문제풀기 
		for(int i=0; i<4; i++) {
			if(i%2==0) {
				for(int j=0;j<5;j++) {
					a[i][j] = num++; 
					// a[i][j] =num++; 대입연산자가 일어난후 단일연산자++실행 /후위단일연산자
					// a[i][j] =++num; 1단일 2대입 /전위 단일연산자
				}
			}else {
				for(int j=4;j>=0;j--) {
					a[i][j] = num++;
				}
				
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
