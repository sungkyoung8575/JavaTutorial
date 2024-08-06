package _01Array;

public class _00과제 {

	public static void main(String[] args) {
		//문제 1
		int[] array = new int[5];
		array[0]=30;
		array[1]=40;
		array[2]=50;
		array[3]=60;
		array[4]=55;
		System.out.println(array[0]+"/"+array[1]+"/"+array[2]+"/"+array[3]+"/"+array[4]);
		
		//문제2
		String[] name = new String[3];
		name[0]="kim";
		name[1]="lee";
		name[2]="park";
		System.out.println(name[0]+"/"+name[1]+"/"+name[2]);
		
		//문제3
		int[] lotto = {6,12,33,4,5,26};
		System.out.println(lotto[2]+2);
		
		//문제 4
		System.out.println(lotto[0]+lotto[2]+lotto[4]);
		
		//문제5
		lotto[0]=6;
		lotto[1]=lotto[0]+lotto[1];
		lotto[2]=lotto[0]+lotto[1]+lotto[2];
		lotto[3]=lotto[0]+lotto[1]+lotto[2]+lotto[3];
		lotto[4]=lotto[0]+lotto[1]+lotto[2]+lotto[3]+lotto[4];
		lotto[5]=lotto[0]+lotto[1]+lotto[2]+lotto[3]+lotto[4]+lotto[5];
		System.out.println(lotto[0]+"/"+lotto[1]+"/"+lotto[2]+"/"+lotto[3]+"/"+lotto[4]+"/"+lotto[5]);
		
		//문제6
		System.out.println(lotto[3]%2>0);
		
		//문제7
		int money = 2750;
		int pay = 10000;
		int change = pay-money;
		System.out.println(change);
		System.out.println("천원"+(change/1000)+"개"+"백원"+(change%1000)/100+"개"+"십원"+(change%100)/10+"개");
		
		//문제8 -
		int xA = 700;
		int yA = 500;
		int xB = 900;
		int yB = 300;
		
		int xC = 650;
		int yC = 150;
		
		System.out.println((xA-xC) <= 0 && (xB-3)-xC >= 0 && (yB+3)-yC >= 0 && yA-yC <= 0);
		// xA < xC < xB  => xA-xC >=0 && (xB-3)-xC <= 0
		// yB < yC < yA  => (yB+3)-yC >=0 && yA-yC <= 0
		System.out.println(xA<=xC && xC<=(xB-3) && yA>=yC && yC>=(yB+3));
		
	}
}
