package _16_Static_final;

public class Main {
	
// 접근제어자 공용변수 리턴타입 메서드명 매개변수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = Thread.currentThread().getName();
		// 스레드가 코드를 실행한다.
		// 현제 코드를 실행하는 스레드의 여러 정보 중
		// 스레드의 이름을 가져오라.
		System.out.println(name+"스레드가 1초 뒤에 시작합니다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// static 변수는	공용변수. 위치는 Method area
		//			   	모든 스레드가 공용해서 사용가능 > 즉, 변수값 접근가능 
		//객체를 만들지 않고 클래스 명과 변수 또는 메서드 명으로 접근
		String a = MemberADM.compayname;
		System.out.println(a);
		System.out.println(MemberADM.compayname);
		MemberADM.prt();
		MemberADM.compayname="바꿔버린다";
		System.out.println(MemberADM.compayname);
		
		
		
		
		MemberADM.teamName="kkk";	
		// 상수는 초기값이 결정되면 값을 변경할수없다
		
		
		
		/* 새로운 스레드를 하나 만들어서 멀티스레드로 운용이 가능
		Thread t1 = new Thread();
		t1.setName("task1 thread");
		String tname = t1.getName();
		System.out.println("새로만든 스레드 이름은"+tname);
		*/
	}

}
