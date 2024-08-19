package _05_2for;

public class _0819_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	7. 거스름돈 구하기   10000원짜리 0개, 1000원짜리 0 개, 100짜리 0개, 10짜리 0개,   
//		조건 : /나 %연산자는 각각 최대 두 번씩 사용가능
//	   단, 거스름돈은 만천원이 최대 값이다. 
	int money=4570;  // 가격
	int pay = 10000;  //지불금액
	int a= pay-money;	//5430
	
	
	
	/* 
	 * a %100 = 10원짜리
	 * a / 10 = 543
	 * a %100 = 100원짜리 
	 * a/10 = 54
	 * a %100 = 1000원짜리 
	 * a/ 10 = 5
	 * 
	 * 
	 * a/10000 = 0b
	 * a-(10000*b) =5430c
	 * c/1000=5
	 * c-(1000*5) = 430c
	 * c/100 =4c
	 * c-(100*4)= 30
	 * a/10 =3 
	 */
		
		
	}

}
