package _05_2for;

public class _0819_Q3_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		3.
//		000*
//		00***
//		0*****
//		*******
		
		for(int i=0; i<4; i++) {
			for(int j=2;j>=i;j--) {
				System.out.print("0");
			}
			for(int j=0;j<=i*2;j++) {
				System.out.print("*");
				}
			System.out.println();
			
		}
		
		System.out.println("--------------");	
		
//		4. 
//		*******
//		0*****
//		00***
//		000*
		
		for(int i=0; i<4; i++) {
			for(int j=0;j<i;j++) {
				System.out.print("0");
			}
			for(int j=7;j>i*2;j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
	}

}
