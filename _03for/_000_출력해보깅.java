package _03for;

public class _000_출력해보깅 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		int temp=0;
		for(int i=100; i< 1000; i++) {
			temp = i;
			sum += temp%10;
			temp /= 10;
			sum += temp%10;
			temp /= 10;
			sum += temp;			
		}
		System.out.println(sum);
	}

}
