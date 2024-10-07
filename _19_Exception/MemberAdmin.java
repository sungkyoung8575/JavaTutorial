package _19_Exception;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MemberAdmin {
	MemberOne[] m = new MemberOne[5];
	MemberAdmin() throws Exception {
	/*	System.out.println(m[0]);
		System.out.println(m[1].getId());	// NullPointerException:
		System.out.println(m[2]);
		System.out.println("close");
	*/
//		test();		// 예외처리 해 줘야 하는 경우와 직접처리
		test1();	// 예외처리를 안해 줘도 되는데 해본 코드
		test2();
	}

	private void test2() throws Exception {
		File file = new File("Output.txt");
		FileWriter writer;
		writer = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
	}
	
	private void test1() {
		MemberOne[] mm = new MemberOne[5];
		try {
			System.out.println("1");
			System.out.println(mm[0]);
			System.out.println("2");
			System.out.println(mm[1].getId());
			System.out.println("정상종료");
		} catch (Exception e) {
			System.out.println("예외발생2");
		} finally {
			System.out.println("finally 블록");
		}
		
	}
	private void test() {	// 예제는 예외처리를 반드시 해 줘야 한다.
							// 예외처리 방법은 직접처리 > try catch finally
		try {
			// try 블록은 예외가 발생할 코드를 작성한다.
			// 예외가 발생하면 더이상 코드를 실행하지 않고 catch 블록으로 이동
			File file = new File("Output.txt");
			FileWriter writer;
			writer = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
		} catch (IOException e) {
			// catch 소괄호안의 예외가 발생했을때 처리를 해주는 블록
			e.printStackTrace();
		} finally {
			// try 구문을 빠져 나갈대 실행됨 / 예외발생 여부 상관없이 실행됨
			
		}
		
	}

}
