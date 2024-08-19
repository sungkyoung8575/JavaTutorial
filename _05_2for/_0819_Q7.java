package _05_2for;

public class _0819_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	7. 거스름돈 구하기   10000원짜리 0개, 1000원짜리 0 개, 100짜리 0개, 10짜리 0개,   
//		조건 : /나 %연산자는 각각 최대 두 번씩 사용가능
//	   단, 거스름돈은 만천원이 최대 값이다. 
	int money=4570;  // 가격
	int pay = 10000;  //지불금액
	int jan = (pay-money)/10;	//5430 / 10 =543   1원단위 짜르기 
	int a=10;
	
	for(int i=0;i<4;i++) {
		System.out.println(a+"원짜리 "+jan%10+"개");
		jan = jan/10;
		a *=10;
		}

		

	

		
	}

}
