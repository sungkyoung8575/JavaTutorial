package _05_2for;

public class _0819_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 
//		*****
//		****
//		***
//		**
//		*
		
		// 수식- 단서는 i값
		
		for(int i=0;i<5;i++) {
			for(int j=5;j>i;j--) {		// for(int j=0;j<=4-i;j++)
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
