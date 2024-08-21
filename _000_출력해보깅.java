

public class _000_출력해보깅 {
	public static void main(String[] args) {

		for(int i=0; i < 4; i++) {
			for(int j=0; j < 4+i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		//j의 값이 if로 출력문자 변경
		for(int i=0; i < 4; i++) {
			for(int j=0; j < 4+i; j++) {
				if(j >= 4-i-1) {
					System.out.print("*");
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
		}	
	}
}
