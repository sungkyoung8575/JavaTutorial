package _00_미니프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r=new Random();
		Scanner in=new Scanner(System.in);
		
		int[] a=new int[3];
		int[] b=new int[3];
		int[] c=new int[3];
			
//		int num1=0;
//		int num2=0;
//		int num3=0;
//		
//		for(int i=0;i<a.length;i++) {
//			num1=r.nextInt(8);
//			a[i]=a[i]+=num1;
//			num2=r.nextInt(8);
//			b[i]=b[i]+=num2;
//			num3=r.nextInt(8);
//			c[i]=c[i]+=num3;
//		}
//		
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
//		System.out.println(Arrays.toString(c));
		int num=0;
		for(int i=0;i<a.length;i++) {
			num=r.nextInt(8);
			a[i]=a[i]+=num;
		}
		System.out.println(Arrays.toString(a));
		
//		for(int i=0;i<a.length;i++) {
//			num=r.nextInt(8);
//			b[i]=b[i]+=num;
//		}
//		System.out.println(Arrays.toString(b));
//		
//		for(int i=0;i<a.length;i++) {
//			num=r.nextInt(8);
//			c[i]=c[i]+=num;
//		}
//		System.out.println(Arrays.toString(c));
		
	}

}
