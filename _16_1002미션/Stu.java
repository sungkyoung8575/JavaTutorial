package _16_1002미션;

import java.util.ArrayList;
import java.util.Scanner;

// 추상화 요구사항의 학생을 멤버변수와 메서드로 정의
// 변수 , 자료형 , 클래스 , 추상화 , 접근제어자 
public class Stu {
	
	private String id = null;
	private String name = null;
	private String tel = null;
	private int grade= -1;
	private PartMge partMge = null; 
	
	//<로그인 기능 선택> 로그인을 하면 수강신청 메뉴와 신청리스트 메뉴가 나온다 ->학생 한명의 기능으로 보고 여기에 넣기
	private ArrayList<Part> myList = new ArrayList<>();
	
	public void menu(PartMge pmge) {
		partMge=pmge;
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1. 수강신청");
			System.out.println("2. 신청목록");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				add();
			}else if(selNum ==2) {
				list();
			}else {
				break;
			}
		}

	}
	
	private void list() {
		System.out.println("수강신청 목록");
		for(int i=0;i<myList.size();i++) {
			myList.get(i).prt();
		}
		
	}
	private Scanner in = new Scanner(System.in);
	private void add() {
		// 교과목의 리스트를 보여줘야 하는데 이 리스트는 partMge 에있다.
		ArrayList<Part> getList = partMge.getPlist();
		for(int i=0;i<getList.size();i++) {
			System.out.println("과목번호: "+i);
			getList.get(i).prt();
		}
		System.out.println("번호선택");
		int choiceNum=in.nextInt();
		in.nextLine();
		myList.add(getList.get(choiceNum));
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void prt() {
		System.out.println("id :"+ id);
		System.out.println("name :"+ name);
		
	}

}
