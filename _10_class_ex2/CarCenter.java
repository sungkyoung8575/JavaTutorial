package _10_class_ex2;

import java.util.Scanner;

public class CarCenter {
	CarOne[] carList = new CarOne[7];
	Scanner in = new Scanner(System.in);
	CarCenter(){
		while(true) {
			int selNum=0;
			menu();		// 메뉴도 별도로 빼기
			System.out.println("번호 선택>");
			selNum= in.nextInt();
			in.nextLine();
			if(selNum==1) {
				carAdd();
			}else if(selNum==2) {
				carMod();
			}else if(selNum==3) {
				carDel();
			}else if(selNum==4) {
				carList();
			}else if(selNum==5) {
				break;
			}
		}
		
	}
	public void menu() {
		System.out.println("1. 등록");	
		System.out.println("2. 수정");
		System.out.println("3. 삭제");
		System.out.println("4. 전체보기");
		System.out.println("5. 종료");
		
	}
	public void carAdd() {
		// 순서
		//1 새로운 차를 만든다   new CarOne();
		//2 차에다 값을 저장한다.
		//3 차를 배열에 등록한다. carList[]
		CarOne temp= new CarOne();
		System.out.println("차랑번호 입력");
		temp.carNumber=in.nextLine();
		System.out.println("차량 소유자 이름 입력");
		temp.carUser= in.nextLine();
		// 배열에 저장
		// 빈칸을 찾자 빈칸은 배열의 밸류값이 null이다
		int maxsize=carList.length; // 참조(.)는 적을수록 좋음 변수로 만들어주기
		for(int i=0;i<maxsize;i++) {
			if(carList[i]==null) {
				carList[i]=temp;
				break;
			}
		}
	}
	public void carList() {
		// 메서드의 정의는 정의가 구체적인 것이 좋다
		// carList 배열 참조변수의 0번부터 순회하면서
		// 저장된 주소값을 참조하여 CarOne객체의 정보를 출력
		for(int i=0;i<carList.length;i++) {
			if(carList[i]!=null) {
//				System.out.println(carList[i].carNumber);
//				System.out.println(carList[i].carUser);
				carList[i].prt();
			}
		}
		
	}
	public void carMod() {
		// 시나리오.. 
		// 번호로 수정 할 자동차 객체를 찾는다.
		// 번호는 수정이 불가능 / 삭제만 할 수 있고, 소유자만 수정이 가능
		System.out.println("수정할 차량번호 입력");
		String modNum=in.nextLine();
		// 객체 찾기 >> 배열 순회필요
		for(int i=0;i<carList.length;i++) {
			if(carList[i]!=null) { // 이렇게 하는 이유가 혹시나 null일때는 참조못하니까! 
				if(carList[i].carNumber.equals(modNum)) {
					System.out.println("변경할 이름 입력");
					String newUser=in.nextLine();
					// 입력된 값의 유효성을 체크 하는등 무결성 코드 추가가능
					carList[i].carUser=newUser;
					break;
				}
			}
		}
		
	}
	public void carDel() {
		// 시나리오.. 
		// 번호로 수정 할 자동차 객체를 찾는다. 그리고 삭제
		System.out.println("삭제할 차량번호 입력");
		String modNum=in.nextLine();
		for(int i=0;i<carList.length;i++) {
			if(carList[i]!=null) { // 이렇게 하는 이유가 혹시나 null일때는 참조못하니까! 
				if(carList[i].carNumber.equals(modNum)) {
					carList[i]=null;
					break;
				}
			}
		}
		
	}
	
	
	
	

}
