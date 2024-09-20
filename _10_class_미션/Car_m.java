package _10_class_미션;

import java.util.Scanner;

public class Car_m {

	Scanner in = new Scanner(System.in);
	Car_obj[] carList= new Car_obj[7];
	
	Car_m(){
		while(true) {
			System.out.println("주차관리");
			System.out.println("1. 차량등록");
			System.out.println("2. 삭제");
			System.out.println("3. 차량조회");
			System.out.println("4. 전체보기");
			int selNum = in.nextInt();
			in.nextLine();
			System.out.println(selNum+"을 선택함");
			
			if(selNum ==1) {
				add();		// 메서드 호출
			}else if(selNum ==2) {
				delete();
			}else if(selNum ==3) {
				cList();
			}else if(selNum ==4) {
				allList();	// 메서드 호출
			}else {
				break;
			}
		}
	}
	public void add() {
		System.out.println("차량등록");
		Car_obj car=new Car_obj();
		System.out.println("차량번호를 입력하세요");
		car.carNum=in.nextLine();
		System.out.println("성함을 입력하세요");
		car.name=in.nextLine();
		System.out.println("휴대폰 번호 뒤 4자리를 입력하세요");
		car.pNum=in.nextInt();
		in.nextLine();
		
		for(int i=0; i<carList.length;i++) {
			if(carList[i]==null) {
				carList[i]=car;
				break;
			}
		}
		
	}
	public void delete() {
		System.out.println("삭제-휴대폰번호 뒷자리입력");
// 아무리해도 모르겠음 이해를 못하고있나봄 안됨
		int a= in.nextInt();
		in.nextLine();
		for(int i=0;i<carList.length;i++) {
			if(carList[i].pNum==a) {
				carList[i]=null;
			}
		}
	}
		
	public void cList() {
		System.out.println("차량조회");
		
	}
	
	public void allList() {
		System.out.println("등록차량 전체조회");
		for(int i=0; i<carList.length;i++) {
			if(carList[i]!=null) {
				carList[i].prt();
			}
		}
	}
	
	
	
}

