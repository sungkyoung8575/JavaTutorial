package _13_ArrayList_프로젝트;

import java.util.ArrayList;
import java.util.Scanner;

public class Javaword {
	ArrayList<Word> wList=new ArrayList<>();
	Scanner in = new Scanner(System.in);
	public Javaword() {
		
		int selNum=0;
		while(true) {
			menu();
			System.out.println("메뉴선택");
			selNum=in.nextInt();
			in.nextLine();
			if(selNum==1) {
				add();
			}else if(selNum==2) {
				allList();
			}else if(selNum==3) {
				del();
			}else if(selNum==4) {
				mod();
			}else if(selNum==5) {
				break;
			}else {
				System.out.println("다시 선택");
			}
		}
	}
	
		
		
	public void menu() {
		System.out.println("1. 등록");
		System.out.println("2. 전체조회");
		System.out.println("3. 삭제(영단어로");
		System.out.println("4. 수정");
		System.out.println("5. 종료");
	}
	
	public void add() {
		Word temp=new Word();
		System.out.println("영어단어 입력");
		temp.en=in.nextLine();
		System.out.println("한글 뜻 입력");
		temp.kr=in.nextLine();
		wList.add(temp);
		
	}
	
	public void allList() {
		for(int i=0;i<wList.size();i++) {
			wList.get(i).prt();
		}
	}
	
	public void del() {
		System.out.println("삭제할 영어단어 입력");
		String temp=in.nextLine();
		for(int i=0;i<wList.size();i++) {
			if(wList.get(i).en.equals(temp)) {
				wList.remove(i);
				
			}
		}
		
	}
	
	public void mod() {
		System.out.println("검색할 영어단어 입력");
		String temp=in.nextLine();
		for(int i=0;i<wList.size();i++) {
			if(wList.get(i).en.equals(temp)) {
				Word newWord=new Word();
				System.out.println("수정할 영어단어 입력");
				newWord.en=in.nextLine();
				System.out.println("수정할 한글 뜻 입력");
				newWord.kr=in.nextLine();
				wList.set(i,newWord);
			}
		}
		
		
	}
		
		
		
	

}


