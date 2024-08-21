package _05_2for;

public class _0819_Q11_Q12 {

	public static void main(String[] args) {
		
//		11.
//		000*
//		00***
//		0*****
//		*******
		
//		0*****
//		00***
//		000*
//		
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4+i;j++) {
				if(j>=4-i-1) {
					System.out.print("*");
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
		for(int i=2;i>=0;i--) {
			for(int j=0;j<4+i;j++) {
				if(j>4-i-1) {
				System.out.print("*");
				}else {
				System.out.print("0");
				}
			}
			System.out.println();
		}

		
		
		
//		12. 9번 문제에서 for문 2개만 사용하기 if문은 갯 수 상관없음.
	}

}
