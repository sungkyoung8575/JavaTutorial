package _10_class_미션2_레벨1;

import java.util.Scanner;

public class T_center {
	T_one[] tlist=new T_one[5];
	Scanner in=new Scanner(System.in);
	T_center(){
		while(true) {
			int selNum=0;
			menu();
			System.out.println("메뉴를 선택하세용");
			selNum=in.nextInt();
			in.nextLine();
			if(selNum==1) {
				add();
			}else if(selNum==2) {
				edit();
			}else if(selNum==3) {
				allList();
			}else if(selNum==4) {
				break;
			}
		}		
	}
	
	public void menu() {
		System.out.println("1. 등록");
		System.out.println("2. 수정");
		System.out.println("3. 전체보기");
		System.out.println("4. 종료");
		
	}
	
	public void add() {
		T_one train = new T_one();
		System.out.println("기차번호 입력");
		train.tNum=in.nextInt();
		in.nextLine();
		System.out.println("기차시간 입력");
		train.tTime=in.nextInt();
		in.nextLine();
		for(int i=0;i<tlist.length;i++) {
			if(tlist[i]==null) {
				tlist[i]=train;
				break;
			}
		}	
	}
	
	public void edit() {
		System.out.println("변경할 기차번호 입력");
		int aditNum=in.nextInt();
		in.nextLine();
		for(int i=0;i<tlist.length;i++) {
			if(tlist[i]!=null) {
				if(tlist[i].tNum==aditNum) {
					System.out.println("변경할 시간 입력");
					int newTime=in.nextInt();
					in.nextLine();
					tlist[i].tTime=newTime;
					break;
				}
			}
		}
	}
	
	public void allList() {
		for(int i=0; i<tlist.length;i++) {
			if(tlist[i]!=null) {
				tlist[i].prt();
			}
		}
		
	}
	
	
	
	
}
	
