package _00_미니프로젝트;

import java.util.Random;
import java.util.Scanner;

public class _00김성경김희태 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Random r= new Random();
		String[] ko= {"빨강","노랑","파랑","초록","보라"};
		String[] en= {"red","yellow","blue","green","purple"};
		int[] a=new int[5];
		int num=0;
		
		for(int i=0;i<5;i++) {
			num=r.nextInt(5);
			if(a[num]==0) {
				a[num]=1;
				System.out.println(ko[num]);
			}else {
				i=i-1;
			}
		}
		

		
		
		
		
		
		
	}

}
