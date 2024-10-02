package _16_Static_final;

public class MemberADM {
	
	public String name = "abc";		// 여기에 final 붙이면 객체 생성될때마다 name 은 생성될꺼고 값은 변경할수없음
	public static String compayname = "Human";
	public static final String teamName="Kimteam";
	
	 MemberADM(){
		 String name = Thread.currentThread().getName();
		 System.out.println(name+"스레드가 MemberADM"+"생성자 실행");
	 }
	
	public static void prt() {
//		System.out.println((name));
	}

}
