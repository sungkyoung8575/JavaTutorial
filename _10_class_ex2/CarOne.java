package _10_class_ex2;

public class CarOne {
	//자동차는 차번호와 소유자의 정보를 저장합니다.

	String carNumber=null;
	String carUser=null;
	
	public CarOne() {
		
	}
	public void prt() {	
		System.out.println("======등록정보======");
		System.out.println(carNumber);
		System.out.println(carUser);
	}

}
