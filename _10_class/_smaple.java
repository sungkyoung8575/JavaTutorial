package _10_class;

import java.util.Random;

public class _smaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*클래스를 기반으로 객체를 만든다. 객체를만들땐 new연산자로
 * 원시변수 / 참조변수 구분 중요
 * 원시변수는 실제값(내가사용할값) 참조변수는 객체의 주소 (객체는 힙영역에 저장된다....아무도 참조하지않으면 제거대상이되고 자바에선 (gc?)가비지컬렉터?가 알아서 삭제함)
 * 예) 결제할때 원시변수 현금 / 참조변수 카드
 * 참조 연산자는   .    
 */
		
		int a=10;
		Random r= new Random(); //**객체를 만든코드
		Random r1=r;			// r과 공유 r은 객체의 주소값  r1=r 같은 주소값이니 문제가없음 r을참조함  **만들어진 객체를공유해서 사용하는 코드
		Random r2=null;		// 값이없음?주소가없음 객체가없음 참조할수없음
		Random r3= new Random();
		
		System.out.println(r.nextInt(4));
		System.out.println(r1.nextInt(4));
		System.out.println(r2.nextInt(4));		//객체를 참조할 주소가 없기때문에 오류가 남
		System.out.println(r3.nextInt(4));
		
		
		
	}

}
