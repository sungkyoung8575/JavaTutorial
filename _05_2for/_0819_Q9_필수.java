package _05_2for;

public class _0819_Q9_필수 {

	public static void main(String[] args) {
		
//		9. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요 <이중For사용>
		 String ttt ="aabbbcccaaaaddbbbaaaaa";
		
	/* 먼저 a 찾아보기
	 * a중 가장 긴 a?
	 * -순회도중 a를 만나는 시작점을 for문으로
	 * i는 문자열의 인덱스
	 * 
	 */
//		int maxCnt=0;	// a길이중 가장 긴 길이
//		int cnt=0;		// 현재 a길이
//		
//		 for(int i=0;i<ttt.length();i++) {
//			 char temp = ttt.charAt(i); 
//			 cnt=0;
//			 if(temp=='a') {			// 시작점 찾기
//				 for(int j=i;j<ttt.length();j++) {		
//					 if(ttt.charAt(j)!='a') {
//						 break;
//					 }else {cnt++;}
//				 }						 
//			 }			// 여기까지 i 값 위치를 시작으로 연속된 a 길이 찾기		
//			 if(maxCnt<cnt) {
//				 maxCnt=cnt;
//				 i=i+cnt-1;		// 이미 카운트 한 인덱스는 건너뛰기  - 더 좋은코드됨
//			 }
//		 }			
//		 
		 // 응용해서 문제 풀어보기 
		 
			int maxCnt=0;	
			int cnt=0;		
			char maxChar=0;
			char nowChar=0;
			
			 for(int i=0;i<ttt.length();i++) {
				 nowChar = ttt.charAt(i); 
				 cnt=0;		
					 for(int j=i;j<ttt.length();j++) {		
						 if(ttt.charAt(j)!=nowChar) {
							 break;
						 }else {cnt++;}						 
				 }
				 if(maxCnt<cnt) {
					 maxCnt=cnt;
					 i=i+cnt-1;		
					 maxChar=nowChar;
				 }
			 }	
			 System.out.println(maxChar+"/"+maxCnt);
		

		
		
	}

}
