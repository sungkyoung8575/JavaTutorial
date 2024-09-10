package _05_2for;

public class _00_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1단만 ㅇ
		for(int i=0;i<5;i++) {
			System.out.println("1*"+i+"="+(i*1));
		}
		
		// 1~4단
		for(int dan=1; dan<5;dan++) {
			System.out.println(dan);
			for(int i=0;i<5;i++) {
				System.out.println(dan+"*"+i+"="+(dan*i));
			}
		}
		
		// 별찍기
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 별찍기2
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// id에 특수문자가 있는가
		//	1- sing의 0번문자부터 찾는다 >> i
		//	2- id의 0번 문자가 특수문자인가?>> j
		String id = "adc*";
		String sign = "*^$";
		int cnt=0;	// 특수문자 카운팅
		
		for(int i=0;i<sign.length();i++) {
			for(int j=0; j<id.length();j++) {
				if(sign.charAt(i)== id.charAt(j))
					cnt++;
			}
		}
		if(cnt>0) {
			System.out.println("특수문자포함");
		}
		
		
	}

}
