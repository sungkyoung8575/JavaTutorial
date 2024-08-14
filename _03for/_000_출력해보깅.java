package _03for;

import java.util.Random;

public class _000_출력해보깅 {
	public static void main(String[] args) {

	
	
	Random r = new Random();  
	int[] cnt = new int[45];
		
	for(int i=0;i<=50;i++) {
		int num = r.nextInt(45)+1;
//		System.out.println(num);
		for(int a=0;a<=45;a++) {
			if(num==a) {
				cnt[a]++;
			}
		}
	}
	
	
	
	
	
	

	}
}
