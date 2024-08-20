package _05_2for;

public class _0820_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1
		int[] arr = {3,45,26,50,74};
		int a = 5;
//		a로 나누어 떨어지는 배열의 값을 모두 출력하시오.
		
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%a == 0) {
				sum += arr[i];
			}
		}
		
		System.out.println(sum);
		
	}

}
