package _00_미니프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _00test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Random r= new Random();
		String[] kr= {"몬스테라","피자","스투키","노래","커피","라면","로즈마리","바질","라벤더",
				"팔손이","사과", "바나나", "오렌지", "전체", "블로그", "네이버", "자바","사탕", "촬영", "레벨", 
				"정렬", "영어", "파워", "링크", "가이드","토익", "도서", "전국", "가격", "다운로드"};
		String[] en= {"red","yellow","blue","green","purple","Orange","Pink","Black","White","Gray","apple", 
				"banana", "orange", "total", "blog", "naver", "java","tutorial", "once", "level", "sort", 
				"english", "power", "link", "guide","toeic", "book", "national", "price", "download"};
		String[] krHard= {"횡단보도","쌍둥이","익스플로러","짱구","측량사","어휘력향상","독립군","철학적사고","감독자격","특별회원"};
		String[] enHard= {"Awkward","Rhythm","Liaison","Subpoena","Colloquial","Czechoslovakia","Uncharacteristically","Phenomenon","Pneumonia","Bureaucracy"};

		int[] a=new int[30];		// 중복되지않게 비교할수있는 임시배열
		int[] b=new int[10];
		int num=0;
		int cnt=0;			//점수 카운트
		int cntF=0;			// 틀린문제 카운트

		
	       System.out.println("╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝╮\r\n"
	       		+"        타자 연습 게임     "+"\n"
	       		+ "╰ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ╯\r\n"
	       		+ "O\r\n"
	       		+ "°\r\n"
	       		+ " /}__/}\r\n"
	       		+ "( • ▼•)  1 한글  /  2 영문  "
	       		+ "");
	       System.out.println();
	       

	       System.out.println();
//	       System.out.println(Arrays.toString(word));

	       String selec =in.nextLine();	
	       String[] word= {};

	       if(selec.equals("1")) {
	    	   word=kr;
	       }else if(selec.equals("2")) {
	    	   word=en;
	       }else {
	    	   for(;;) {
	    		   System.out.println("다시 선택해 주세요");
	    		   selec =in.nextLine();	
	    		     if(selec.equals("1")) {
	    		    	   word=kr;
	    		       }else if(selec.equals("2")) {
	    		    	   word=en;
	    		       }else {
	    		    	   continue;
	    		       }
	    		     break;
	    	   }
	       }
	       
	       
			System.out.println("문제는 총 10문제 입니다.");
		       System.out.println(" 시작합니다 !");
		       System.out.println();

		for(int i=1;i<=10;i++) {
			num=r.nextInt(30);
			if(a[num]==0) {
				a[num]=1;		
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("문제"+i+" : "+word[num]);		//선택한 배열 랜덤으로 출력
				String answer=in.nextLine();					// 답받기
				if(answer.equals(word[num])) {					// 받은 답이랑 배열 문자열이 같은지 비교
					cnt+=10;
					System.out.println("일치");
					System.out.println();
					System.out.println("▶현재점수 "+cnt+"점");
					System.out.println();
				}else {
					cntF++;
					System.out.println("불일치");
					System.out.println();
					System.out.println("▶현재점수 "+cnt+" 점");
					System.out.println();
				}
			}else {
				i=i-1;
			}	
			if(i==10) {
				System.out.println("==========================");
				System.out.println("게임종료 ▶총점수 "+cnt);
				System.out.println("==========================");
				if(cnt<80) {
					System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\r\n"
							+ "████▌▄▌▄▐▐▌█████\r\n"
							+ "████▌▄▌▄▐▐▌▀████\r\n"
							+ "▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀\r\n"
							+ "");
					System.out.println(cntF+" 문제 틀렸습니다...까비..");
					System.out.println("재도전 하시겠습니까?");
					System.out.println("1.네   "+ ""+"2.아니오");
					selec = in.nextLine();	
					if(selec.equals("1")) {
						i=0;		// 재도전하면 다시 처음으로 돌아가기 위해 
						cnt=0;
						cntF=0;		// 재도전 안하면 종료되게
					}else if(selec.equals("2")) {
						break;
					}
					else {
						break;
					}
				}else {
					System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\r\n"
							+ "█░░░░░░░░▀█▄▀▄▀██████░▀█▄▀▄▀██████░\r\n"
							+ "░░░░░░░░░░░▀█▄█▄███▀░░░ ▀██▄█▄███▀░\r\n"
							+ "");
					System.out.println("좀 더 어렵게 ㄱㄱ?");
					System.out.println("1.ㄱㄱ   "+ ""+"2.놉");
					selec = in.nextLine();
				}
			}
		}
		
		if(selec.equals("1")) {
		       System.out.println("     1. 한글, 2. 영문 ");
		       System.out.print("     번호를 선택해주세요: ");
				String selec1 = in.nextLine();	
				String[] word1 = (selec1.equals("1")) ? krHard : enHard;
			
			for(int i=1;i<=10;i++) {
				int num1=r.nextInt(10);
				if(b[num1]==0) {
					b[num1]=1;
					System.out.println("문제"+i+" : "+word1[num1]);
					String answer=in.nextLine();
					if(answer.equals(word1[num1])) {
						cnt+=100;
						System.out.println("일치");
						System.out.println("▶현재점수 "+cnt+"점");
					}else {
						System.out.println("불일치");
						System.out.println("▶현재점수 "+cnt+"점");
					}
				}else {
					i=i-1;
				}
			}
		}
		System.out.println("================================");
		System.out.println("。　♡ 。　　♡。　　♡\r\n"
				+ "♡。　＼　　｜　　／。　♡\r\n"
				+ "　      끝\r\n"
				+ "♡。　／　　｜　　＼。　♡\r\n"
				+ "。　♡。 　　。　　♡。\r\n"
				+ "");


		
	}

}
