package _02if;

public class 오늘과제 {

	public static void main(String[] args) {
		// 1.
		double mean = 89.2;
		 if (mean >= 80) {
			 System.out.println("합격");
		 }else {
			 System.out.println("불합격");
		 }

		// 2.
		 int level=2;
		 int point=30;
		 
		 if(level == 1) {
			 point +=30;
		 }else {
			 point += 10;
		 }
		 System.out.println(point);
		 
		// 3.
		 int [] lotto = {6,12,33,4,5,26};
		 System.out.println(lotto[2]+80);
		 
		// 4.
		 if(lotto[3]%2 > 0) {
			 System.out.println("홀수");
		}else {
			System.out.println("짝수");
			
		// 5.
		int sum = 0;
		if(lotto[0]%2 == 1) {sum += lotto[0];}
		if(lotto[1]%2 == 1) {sum += lotto[1];}
		if(lotto[2]%2 == 1) {sum += lotto[2];}
		if(lotto[3]%2 == 1) {sum += lotto[3];}
		if(lotto[4]%2 == 1) {sum += lotto[4];}
		if(lotto[5]%2 == 1) {sum += lotto[5];}
		System.out.println(sum);
		 
			
		// 6.
		 int [] a = {45,34,64,45,24};
		 System.out.println(a[0]+a[1]+a[2]+a[3]+a[4]);
		}
		 
		// 7.
		 int[] a = {45,34,64};
		 int[] b = {0,0,0};
		 int max = 0;
		 b[0] = (a[0]/10)+(a[0]%10);
		 b[1] = (a[1]/10)+(a[1]%10);
		 b[2] = (a[2]/10)+(a[2]%10);
		 if(max < b[0]) {
			 max = b[0];
		 }
		 if(max < b[1]) {
			 max = b[1];
		 }
		 if(max < b[2]) {
			 max = b[2];
		 }
		 System.out.println(max+"/세번재");
		
//		 System.out.println((a[0]/10)+(a[0]%10));
//		 System.out.println((a[1]/10)+(a[1]%10));
//		 System.out.println((a[2]/10)+(a[2]%10));
		 
		 
		 
		// 8. 총알에 맞는 새 번호
		 int[] x = {6,5,9};
		 int[] y = {4,10,6};
		 int bx =3;
		 int by =2;
		 
		 if(x[0]%bx ==0 && y[0]%by ==0) {System.out.println("맞음");
		 }else {System.out.println("빗나감");
		 	}
		 if(x[1]%bx ==0 && y[1]%by ==0) {System.out.println("맞음");
		 }else {System.out.println("빗나감");
			}
		 if(x[2]%bx ==0 && y[2]%by ==0) {System.out.println("맞음");
		 }else {System.out.println("빗나감");
			}

		// 9. 슈팅게임 적 가로5세로6 / 미사일 가로2세로2
		 int aX = 10;
		 int aY = 20;
		 int mX = 11;
		 int mY = 5;
		 if(aX-2 <= mX && aX+7 >= mX+2) {
			 System.out.println("hit");
		 }else {System.out.println("빗나감");
		 }
		 
		 
	}

}
