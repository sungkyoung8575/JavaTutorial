package _04_Random;

import java.util.Random;

public class _0814_test3 {

	public static void main(String[] args) {
	
//		
//		단어를 출력할 때
//		순차적으로 출력하지 않고
//		랜덤으로 모든 단어를 출력하고 싶다.
//		단어는 딱 한 번만 출력할 수 있으며 모든 단어가 모두 출력되어야 한다.

		String[] word ={"apple","banana","car","dog","cat","computer"};
		int[] a = new int[6];
		Random r=new Random();
		
		
		for(int i=0;i<word.length;i++) {
			int num=r.nextInt(6);
			if(a[num]==0) {
				a[num] = 1;
				System.out.println(word[num]);
			}else {
				i=i-1;
					}
		}
		
	}
}
