package _08_Array2;

public class _0910_2차원배열_문제7 {

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
// 위와같은 게임 배열에서 같은 번호가 세로로 연속 3개 이상이면 제거가 가능하다. 
// 제거가 가능한 블록의 좌표롤 출력하시오
		int[][] b= {{1,1,0,2},
					{3,2,1,2},
					{0,0,3,2},
					{4,4,4,4},
					{2,4,3,1},
					{2,4,1,3}};

		int[] c= new int[4];		// 비교할 임시배열
		int[] cnt= new int[4];		// 같은 자리에 값이 똑같으면 카운트 할 배열

		for(int i=0;i<b.length;i++) {
			for(int j=0; j<b[j].length; j++) {
				if(c[j]==b[i][j]) {
					cnt[j]++;
					if(cnt[j]+1==3) {
						System.out.println("세로삭제"+b[i][j]);	// 3개째 현재 삭제할 번호
						System.out.println("b"+"["+(i-2)+"]"+"["+j+"]");
						System.out.println("b"+"["+(i-1)+"]"+"["+j+"]");
						System.out.println("b"+"["+i+"]"+"["+j+"]");
					}else if (cnt[j]+1>3) {					// 3개 이상일때추가로 나오게해봄..
						System.out.println("b"+"["+i+"]"+"["+j+"]");
					}
				}else {cnt[j]=0;}
				c[j]=b[i][j];
				//System.out.print(c[j]+"\t");
			}
			//System.out.println();
			//System.out.println(">"+cnt[0]+"\t"+">"+cnt[1]+"\t"+">"+cnt[2]+"\t"+">"+cnt[3]+"\t");	
		}
		

		
		
		
		
		
	}

}
