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
				// 지웠으면 for 종료시켜주는게 좋음
				break;
			}
		}
		
	}
	
/*	public void mod() {
		System.out.println("검색할 영어단어 입력");
		String temp=in.nextLine();
		for(int i=0;i<wList.size();i++) {
			if(wList.get(i).en.equals(temp)) {
				
				System.out.println("수정할 영어단어 입력");
				wList.get(i).en = in.nextLine();
				
				System.out.println("수정할 한글 뜻 입력");
				wList.get(i).kr = in.nextLine();
*/
  public void mod() {
		System.out.println("검색할 영어단어 입력");
		String temp=in.nextLine();
		boolean flag= true;  // 검색한 단어가 없을수 있으니 변수하나 만들어주고
		for(int i=0;i<wList.size();i++) {
			if(wList.get(i).en.equals(temp)) {
				Word newWord=new Word();
				System.out.println("수정할 영어단어 입력");
				newWord.en=in.nextLine();
				System.out.println("수정할 한글 뜻 입력");
				newWord.kr=in.nextLine();
				wList.set(i,newWord);
				flag=false;			// 단어를 수정했다면 false 로 바꿔주기
				break; 		//for 종료해주기
			}
		}
		if(flag) {		// (flag=true)라면 바뀐게 없는거니까 포문 끝나고 확인해서 요러케
			System.out.println("변경할 단어가 없습니다.");
		}

		
		
		
		
		
	}
}


