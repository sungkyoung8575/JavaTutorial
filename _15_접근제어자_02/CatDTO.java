package _15_접근제어자_02;

public class CatDTO {
	private String name = null;	
	private int age = 1;
	// 멤버변수는 은닉화 시킨다 . 접근제어자로
	// 은닉화 시키면 CatDTO클래스 외부에서 변수에 참조 어케함?
	// 일단 은닉화하고 멤버 변수에 저장 및 인출에 관련 메서드를 만든다
	// 저장하는 메서드를 setter , 인출하는 메서드를 getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		chkname(name);
		this.name = name;
	}
	private void chkname(String name2) {
		// TODO Auto-generated method stub
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
