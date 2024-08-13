package _03for;

public class _Q6 {

	public static void main(String[] args) {
		
//		6
		String a ="23-56+45*2-56";
		
//		수식을 계산하는 프로그램을 작성하세요.
//		수식 계산 규칙은 연산자 우선순위 없이 앞에서 부터 차례대로 계산한다.
//		지금까지 공부한 내용으로 해결하시고, 형변환만 검색이 가능합니다. 
//		메서드는 최대한 적게 사용하세요
		char sign='+';
		int result=0;
		String tempInt="";
		a=a+"+";   // for문이 반복되는 동안 if문에서 계산을 해야 하는데
		           // i가 배열의 마지막 인덱스 일 경우는 if문에 true가 되지 않는다.
		           // 그래서 원본에 +를 마지막에 추가하여 해결 함.
		for(int i=0; i < a.length(); i++){
		   	char temp = a.charAt(i);
		   	if(temp == '+' || temp == '-' ||temp == '*'){
		   		int tempInteger = Integer.valueOf(tempInt);
//		   		System.out.println(tempInteger);
		   		if(sign == '+'){
		   			result += tempInteger;
		   		}else if(sign == '-'){
		   			result -= tempInteger;
		   		}else if(sign == '*'){
		   			result *= tempInteger;
		   		}
//		   		System.out.println(sign);
//		   		System.out.println(result);
		   		sign=temp;
		   		tempInt="";
		   	}else{
		   		tempInt += temp;
		   	}
		}
		System.out.println(result);
	
	}
}
