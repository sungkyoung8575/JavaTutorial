package _05_2for;

public class _0819_Q10 {

	public static void main(String[] args) {
		
//		10 난건물주  <이중For사용>
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size=2;
//		arr 배열에서 0이 의미하는 것은 공터이다. 
//		size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
//		size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
//		size가 2일경우에 7개이다. 
		
		int cnt=0;
		int home=0;
		
		for(int i=0; i < arr.length; i++) {
			cnt=0;
			for(int j=i; j < arr.length; j++) {
				if(arr[j]==0) {
					cnt++;
				}else {
					break;
				}
			}
			if(cnt>=size) {
				home += cnt-size+1;		//
				i += cnt-1;
			}
		}
		System.out.println("건물 수 "+home);
		
		
	}

}
