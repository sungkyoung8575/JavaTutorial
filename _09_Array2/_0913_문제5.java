package _09_Array2;

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
		
		// 변수 4개 만들기
		int 행최소값 = 0;
		int 행최대값 = 3;
		int 열최소값 = 0;
		int 열최대값 = 4;
		
		// 맨 위에 부분 숫자채우기 1 2 3 4 5
		// 맨 위는 행최소값 0 열최소값 0 열최대값 4
		// 맨 위(두번째(안쪽15 16 17)) 행최소값 1 열최소값 1 열최대값 3
		for(int i=열최소값;i<=열최대값;i++) {
			a[행최소값][i]=num++;
		}
		
		// 위 반복문이 완료되었다면 0번행은 채울 필요없다  6 7 8
		// 행의 최소값을 증가시켜 버린다.
		행최소값++;
		for(int i=행최소값; i<=행최대값; i++) {
			a[i][열최대값]=num++;
		}
		
		열최대값--;
		for(int i=열최대값; i>=열최소값; i--) {
			a[행최대값][i]=num++;
		}
		
		행최대값--;		// 행 1 2 열은 0 3
		for(int i=행최대값; i>=행최소값; i--) {
			a[i][열최소값]=num++;
		}
		
		열최소값++; // 행 1 2 열 1 3
		
		
		
		
		//배열값 출력부
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+"\t ");
			}
			System.out.println();
		}
		
		
		
	}

}
