package _00_미니프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r=new Random();
		Scanner in=new Scanner(System.in);
		
		int[] num=new int[9];
		int[] temp=new int[9];
		int random=0;

		for(int i=0;i<num.length;i++) {
			num[i]=r.nextInt(8);
			if(temp[i]==0) {
				temp[i]=1;	
			}
			
		}
		System.out.println(Arrays.toString(num));
		
		
	}

}
