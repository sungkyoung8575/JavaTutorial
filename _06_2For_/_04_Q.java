package _06_2For_;

public class _04_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b = {93,45,83,58,75,56};
		//다음조건에 따라 오름차순으로 정렬하시오.
		int tempMaxIndex = 0;
		
		for(int i=0; i<b.length; i++) {
			System.out.println(i+"번째 큰값 찾는 중 -------------");
			tempMaxIndex = 0;
			for(int j=0; j < b.length - i; j++) {
				System.out.println(j +"번째 부터 서치");
				if(b[tempMaxIndex] < b[j]) {
					tempMaxIndex = j;
				}
			}
			// 가장 큰 값과 뒤에 값과 swap
			int temp = b[b.length-1-i];
			b[b.length-1-i]=b[tempMaxIndex];
			b[tempMaxIndex]=temp;
			
			// i번째 큰 값 찾아서 변경된 배열 확인 반복문
			for(int k=0; k<b.length; k++) {
				System.out.print(b[k]+" ");
			}
			System.out.println();
			
		}

	}

}
