package _06_2For_;

public class _02_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 97};
		//배열의 평균값을 구하시오. 소수점 표현하시오. 
		double avg=0.0;
		
		for(int i =0; i < arr.length; i++) {
			avg += arr[i];
		}
		System.out.println(avg/arr.length);

	}

}
