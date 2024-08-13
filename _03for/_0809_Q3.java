package _03for;

public class _0809_Q3 {

	public static void main(String[] args) {
		
//13. int[] arr = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,2,0,0,0,0,0,3,3}
//숫자는 터널의 번호이다. 터널의 길이가 가장 긴 숫자와 길이를 출력하시오.   
		int[] arr = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,2,0,0,0,0,0,3,3};
		int bT=arr[0];
		int cnt=1;
		int maxLength=0;
		int maxIndex=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==bT) {
				cnt++;
			}else {
				cnt=1;
				bT=arr[i];
			}
			if(maxLength<cnt) {
				maxLength=cnt;
				maxIndex=bT;
			}
		}
		System.out.println(maxLength+"/"+maxIndex);
		
//14. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요
 String ttt ="aabbbcccaaaaddbbbaaaaa";
		// ttt는 참조타입, 기능을 가지고있다 charAt 으로 가져올수있겟눼~?
		// 문자열의 문자를 첫번째부터 하나씩 가져온다 
 		// 
 	for(int i=0;i<ttt.length();i++) {
		
	}
//15.  String ttt ="aabbbcccaaaaddbbbaaaaa";
//   압축하시오. 압축 하는 방법 a2b3c3a4d2b3a5

	}

}
