package _00_미니프로젝트;

import java.util.Random;
import java.util.Scanner;

public class _00김성경김희태 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Random r= new Random();
		String[] ko= {"몬스테라","산세베리아","스투키","필로덴드론","스파티필럼","관엽식물","로즈마리","바질","라벤더","팔손이"};
		String[] en= {"red","yellow","blue","green","purple","Orange","Pink","Black","White","Gray"};
		int[] a=new int[10];
		int num=0;
		int cnt=0;
		
		for(int i=0;i<10;i++) {
			num=r.nextInt(10);
			if(a[num]==0) {
				a[num]=1;
				System.out.println(ko[num]);
				String word=in.nextLine();
				if(ko[num].equals(word)) {
					cnt+=10;
					System.out.println("일치");
					System.out.println("현재점수 "+cnt+"점");
				}else {
					System.out.println("불일치");
					System.out.println("현재점수 "+cnt+"점");
				}
			}else {
				i=i-1;
			}		
		}
		
		System.out.println("게임종료 총점수 "+cnt);
		
		
	
		

		
		
		
		
		
		
	}

}
