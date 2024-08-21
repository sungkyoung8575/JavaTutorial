package _00_미니프로젝트;

import java.util.Random;

public class _test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 랜덤한 4글자 문자열 만들기
		
	    String str = "1234MNO890ABCDEFGHIJKL567PQRSTUVWXYZSLK";
	    Random random = new Random();
	 
	  for(int i=0;i<4;i++) {
		  int num=random.nextInt(40);
		  System.out.print(str.charAt(num));
	  }
	  
	  
	  
	  
	  
		
	}

}
