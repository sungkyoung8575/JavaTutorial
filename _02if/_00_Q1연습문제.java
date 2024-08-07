package _02if;

public class _00_Q1연습문제 {

	public static void main(String[] args) {

		/*문제 풀어보기
		영수는 게임 개발중, 명중에 따라 점수를 차등 부여하는 알고리즘 제작중
		x는 화살의 위치이며 화살의 위치는 달라진다
		화살의 위치가 
		0에서 12 사이면 +10점
		13-20 사이면 +9점
		21-30 사이면 +8점
		31 이상이면 +7점을 부여한다.
		up1
		0부터 12 사이면 +10점을 획득하고 0-1사이면 보너스 점수를 획득한다.
		보너스 점수는 현재 point 의 10% 이다.*/
		
		int point=20;
		int x=0;	
		// basic
//		System.out.println(x >= 0 && x <= 12);
//		System.out.println(x <= 20);
//		System.out.println(x <= 30);
//		System.out.println(x > 30);
		if(x >= 0 && x <= 12) {
			point += 10;
		}else if(x <= 20) {
			point += 9;
		}else if(x <= 30) {
			point += 8;
		}else if(x > 30) {
			point += 7;
		}
		System.out.println(point);
		
		// up1
		if(x >= 0 && x <= 12) {
			if(x>=0 && x <=1) {
				point += point*0.1;
			}
			point += 10;
		}else if(x <= 20) {
			point += 9;
		}else if(x <= 30) {
			point += 8;
		}else if(x > 30) {
			point += 7;
		}
		System.out.println(point);
		
	}

}
