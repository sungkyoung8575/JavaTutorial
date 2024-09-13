package _09_Array2;

public class _0913_문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1번부터 5번까지의 선언문 
		int[][] a= new int[4][5];
		int num=1;
//문제4.		
		// 배열 값 입력부
/*		1	2	4	7	11
		3	5	8	12	*15		// *쪼개서 2중for문 두개로 풀수도있고! 
		6	9	13	*16	18		// i(열)를 8번 반복하되 필요없는부분 스킵하고 넘어갈수도있음
		10	14	*17	19	20
		
		액셀로 메모
*/		
		// 여기에 문제풀기 
		
		for(int i=0; i<8; i++) {
			//System.out.println(i+"번째 채우기를 합니다."); 	
			int newCol=i;
			for(int j=0;j<=i;j++) {
				if(j>3) continue;	// if절에서 한줄이면 괄호생략
				if(newCol < 5) {
				//System.out.println("j<행>"+j+"열"+newCol);
					a[j][newCol]=num++;
				}
				newCol--;
			}
		}
		
		
		//배열값 출력부
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
