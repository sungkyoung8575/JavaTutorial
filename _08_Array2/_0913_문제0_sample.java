package _08_Array2;

public class _0913_문제0_sample {

	public static void main(String[] args) {		
		
/*★★★★★ 코드를 보고 자바의 이론으로 정리하기 ★★★★★★
 *	 
 *	선언문 (변수와 자료형) 변수명:a, 자료형은 2차원배열  머릿속에 표 그려보기
 *	변수 : 값을 저장하는 기억공간
 *	2차원배열은 행과 열로 이루어진 기억공간
 *	int[4][5] = 행이 4개, 열이 5개
 *	행의 인덱스 번호는 0 -3 , 열의 인덱스 번호는 0 - 4
 */	
		
		int[][] a= new int[4][5];
		int num=1;
		
		//for문정의 2차원 배열 a의 값을 0번행부터 모두 출력  
		// 실제 코드는 행 = i , 열 = j  이해하기쉽게 일단 작성
		for(int 행=0;행<4;행++) {
			//System.out.println(">행"+행);
			for(int 열=0;열<5;열++) {
				System.out.print(a[행][열]+"\t");	//"\t" 개행문자 t의의미는 tap만큼띄우기
			}
			System.out.println();
		}
		
 //============================================================
		
		// ★★ 2차원 배열의 값을 저장하는 코드 ★★
		// if,for 등 작성할 때 한가지 기능만 정의하고 작성한다.
		// 한 가지 기능만 정의하고 작성하는 개발자의 센스 << 김티처개인생각이나 많은사람이 공감함
		// 이렇게하면 1부터 차례대로 배열값이 저장됨
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				// i , j 값으로 배열을 순회하는 순서를 결정
				// 순회하면서 num의 값을 저장
				a[i][j] = num ;
				// 저장했으니 num값을 증가시킨것.
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
