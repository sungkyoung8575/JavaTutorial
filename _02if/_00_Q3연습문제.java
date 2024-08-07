package _02if;

public class _00_Q3연습문제 {

	public static void main(String[] args) {
		
/*a 와 b 는 도로의 길이이며 위치이다.
my 는 나의 위치이다
내가 도로위에 있으면 도로위, 도로위가 아니라면 도로가 아님이라고
출력하시오
//up1
만약 내가 도로 위라면 
a 지점 으로부터 5(my 위치에 따라달라짐) 만큼 떨어져있습니다. 라고 출력
//up2
up1에서 현재 my 의 위치가 가까운 쪽 기준으로 출력
예를들어 my 18이면 b 에 더 가까우니 b 에서 부터 2거리 떨어져있습니다.
*/
	int a = 10;
	int b = 20;
	int my = 15;

	if(my >= a && my <= b) {
		System.out.println("도로위");
	}else {System.out.println("도로가 아님");	}
	
	//up2	
	 if( a <= my && my <= b) {
		 System.out.println("도로 위");
		 int distanceCenter = a+(b-a)/2;
		 System.out.println(distanceCenter);
		 if(my <= distanceCenter) {
			 System.out.println("a로 부터 "+(my-a));
		 }else {
			 System.out.println("b로 부터 "+(b-my));
		 }
	 }else {
		 System.out.println("도로가 아님");
	 }
	 
	}
}
	
	

