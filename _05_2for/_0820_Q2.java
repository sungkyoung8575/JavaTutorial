package _05_2for;

public class _0820_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2
		int[] arr = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
//		배열의 평균값을 구하시오. 소수점 표현하시오. 
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		
//		System.out.println(sum);
//		System.out.println(arr.length);
		System.out.println((double)sum/arr.length);
		
		
		
	}

}
