package _09_Array2;

public class _0913_테트리스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		tempArr					nowblock
		1	1	0				0	0	1
		0	1	0	>오른쪽회전>	1	1	1
		0	1	1				1	0	0
*/
		
		int[][] tempArr= {{1,1,0},
				  		  {0,1,0},
				  		  {0,1,1}};
// 문제1 현재 -> 오른쪽회전
		/*  오른쪽회전						  
		좌표로 찍어보기
		0,0	0,1	0,2		2,0	1,0	0,0	 열 고정 행감소 열을i로
		1,0	1,1	1,2		2,1	1,1	0,1
		2,0	2,1	2,2		2,2	1,2	0,2
		*/
//		int row= tempArr.length;
//		int col=tempArr[0].length;
		
		int[][] nowblock=new int[3][3]; // 현재 블록
		
		for(int i=0;i<3;i++) {
			
			for(int j=2;j>=0;j--) {
				nowblock[j][i]=tempArr[j][i];
				System.out.print(nowblock[j][i]+"\t");
			}
				System.out.println();
		}
		
		System.out.println("↑오른쪽으로 회전");
		System.out.println("↓왼쪽으로 회전");
		
// 문제2 현재 -> 왼쪽회전

		/*  왼쪽으로 회전						  
		좌표로 찍어보기
		0,0	0,1	0,2		0,2 1,2 2,2  열고정 행증가 열 i로 
		1,0	1,1	1,2		0,1 1,1 2,1
		2,0	2,1	2,2		0,0 1,0 2,0
		*/

		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				System.out.print(nowblock[j][i]+"\t");
			}
				System.out.println();
		}
///////////////////테스트해보기////////////////////////////////////

		
	}

}
