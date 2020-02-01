package if_statement;

public class Ex01 {
	public static void main(String[] args) {
		/* 조건문 if
		 * 조건식이 true면 아래의 종속문장을 실행
		 * 종속문장이 한문장이면 {}생략가능
		 * if의 조건식이 거짓이면 else if()조건식을 물어봄
		 * if와 else if가 전부 거짓이면 else의 종속문장을 실행
		 */
		
		int kor = 95, eng = 65;
		double avg = (kor + eng) / 2.0;
		
		if(kor < 50 || eng < 50)
			System.out.println("과락");
		else if(avg > 70)
			System.out.println("합격");
		else
			System.out.println("불합격");
	}
}
