package _02if;

public class _00_Q2연습문제 {

	public static void main(String[] args) {
/*수강관리 프로그램
	이름 학번 나이 성적
	18세 미만은 수강신청 불가
	성적 60점 이상~70미만 학생은 수강신청 가능하나 이름뒤에 별표
	학생성적
	90이상 A
	80이상 B
	70이상 C
	60이상 D
	60미만F */
		String name = "김성경";
		int num =900726;
		int age =34;
		int score = 65;
		String grade = "";
		
		if(age >= 19) {
			if(score >= 90) {
				grade ="A";
			}else if(score >= 80) {
				grade ="B";
			}else if(score >= 70) {
				grade ="C";
			}else if(score >= 60) {
				grade ="D";
				name +="*";
			}else if(score < 60) {
				grade ="F";
			}
		}
		else {
			System.out.println("수강신청 불가");
		}
		
		System.out.println(name+"/"+num+"/"+age+"/"+score+"/"+grade);
	}

}

