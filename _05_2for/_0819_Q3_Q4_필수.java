package _05_2for;

public class _0819_Q3_Q4_필수 {

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
		
		/* 선생님이랑 같이 풀기
		 * 
		 * j로 봣을때
		 * 0123
		 * 01234
		 * 012345
		 * 0123456
		 * 
		 * int i=0; i<4
		 * int j=0; j<4+i;
		 * 
		 *for(int i=0; i<4 ;i++){
		 *	for(int j=0; j<4+i ; j++){
		 *		if(j>=4-i-1){
		 *		sysout("*")
		 *		}else { sysou ("0")}
		 *	}
		 *}
		 *
		 * 
		 * 
		 */
		
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
