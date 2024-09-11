package _08_Array2;

import java.util.Scanner;

public class _0910_2차원배열_문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
1 1 0 2
3 2 1 2
0 0 3 2
4 4 4 4 
2 4 3 1
2 4 1 3
*/
		
// 키보드로 좌표를 입력하면, 좌표기준으로 왼쪽 또는 오른쪽으로 3개 이상의 연속된 숫자가 있으면 제거가능
// 제거 가능이면 제거를 하고 위에 있는 숫자가 아래로 내려온다.
// 맨위에 배열은 랜덤수로 채워진다.
		

		//  아직 무리 나 아직 못풀었음   //
		
	int[][] b= {{1,1,0,2},
				{3,2,1,2},
				{0,0,3,2},
				{4,4,4,4},
				{2,4,3,1},
				{2,4,1,3}};
	Scanner in = new Scanner(System.in);
	System.out.println("0~5 사이 숫자를 입력하세요");		// 행 인덱스번호 받아오기
	int row = in.nextInt();
	System.out.println("0~3 사이 숫자를 입력하세요");		// 열 인덱스번호 받아오기
	int cal = in.nextInt();
	System.out.println("b["+row+"]"+"["+cal+"]");	// 좌표출력
	
	//System.out.println(b[row][cal]);


	for(int i=0;i<b[row].length;i++) {
		//System.out.print(b[row][i]+"\t");
	}
	
	
	
	
	
	
	
	
	
	}

}
