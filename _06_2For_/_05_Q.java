package _06_2For_;

public class _05_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] carnum = {1232,1221,1235,1252,1234,4536,3457,3239,3229,2599};
		int[] parking = new int[10];
		
		int nowCar=0;
		int carPositionIndex=0;
		int totalCarCnt=0;
		for(int i=0; i < carnum.length; i++) {
			//초기 주차 정보 분석
			nowCar = carnum[i];
			carPositionIndex = nowCar%10;
			System.out.println(nowCar+"차량 "+carPositionIndex +" 번이 주차자리입니다");
			
			// 주차장에 자리가 있다면
			if(totalCarCnt < parking.length) {
				//빈자리를 찾을 때 까지 반복
				for(;parking[carPositionIndex]!=0;) {
					System.out.println("빈자리인지 확인 중입니다.");
					carPositionIndex=(carPositionIndex+1)%(parking.length);
					System.out.println(carPositionIndex+"번호로 새로 배정");
				}
				
				// 22 반복문에서 빈자리를 찾았다면
				System.out.println(carPositionIndex+"번호에 주차 합니다");
				parking[carPositionIndex]=nowCar;		
				totalCarCnt++;				
			}
			
		}

	}

}
