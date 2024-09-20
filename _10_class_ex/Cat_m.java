package _10_class_ex;

import java.util.Scanner;

// 고양이 관리 단일책임을 부여함.
public class Cat_m {
	// 클래스 바로 안쪽이라서 멤버변수라고 한다.
	// 여기서 선언한 이유는 클래스 내부 어느곳에서든 참조가능
	Scanner in = new Scanner(System.in);
	Cat_obj[] clist= new Cat_obj[5];	
	/*//해석해보면  (끊어서 보기)
	 * 1.선언문이다 (자료형뒤에 변수가 오면 선언) 
	 * 2.자료형타입 확인하기
	 * 	-cat_obj타입의배열  , 원시타입인지 참조타입인지
	 * 3.변수 - 참조변수
	 * 4.대입연산자
	 * 5. new
	 * 6.cat_obj[5] 생성자
	 * clist 참조변수는 배열객체의 주소를 저장한다
	 * 배열은 값으로 cat_obj객체의 주소값을 저장하며
	 * 배열의 길이는 5이다
	 * 위 선언문에서 변수는 배열의 주소의값을 저장한다
	 * 배열의 값은 cat_obj 객체의 주소값을 저장한다
	 * 객체와 객체의 주소값의 의미는 다르다. 
	 * 객체는 실제 사용하려는 대상이고 존재가 있어야한다
	 * 객체의 주소값은 실제 사용하려는 대상이 없어도 그 자체로 의미를 가진다.
	 */
	Cat_m(){
		while(true) {
			System.out.println("고양이 관리자");
			System.out.println("1. 등록");
			System.out.println("2. 삭제");
			System.out.println("3. 수정");
			System.out.println("4. 전체보기");
			System.out.println(" 선택 >> ");
			int selNum = in.nextInt();
			in.nextLine();
			System.out.println(selNum+"을 선택함");
			
			if(selNum ==1) {
				add();		// 메서드 호출
			}else if(selNum ==2) {
				
			}else if(selNum ==3) {
				
			}else if(selNum ==4) {
				allList();	// 메서드 호출
			}else {
				break;
			}
		}
	}
	public void add() {	// 메서드 정의
		System.out.println("고양이 등록");
		// 새로운 고양이 만들어야지?
		Cat_obj cat = new Cat_obj();
		System.out.println("고양이 이름을 입력");
		cat.name = in.nextLine();
		System.out.println("고양이 나이을 입력");
		cat.age = in.nextInt();
		in.nextLine();
		for(int i=0;i < clist.length; i++) {
			if(clist[i]==null) {
				clist[i]=cat;
				break;
			}
		}
		
	}
	public void allList() {
		System.out.println("고양이 전체 보기");
		for(int i=0;i < clist.length; i++) {
			if(clist[i]!=null) {
				clist[i].prt();
			}
		}
	}
		
		
	
}
