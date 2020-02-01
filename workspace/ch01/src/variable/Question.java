package variable;

public class Question {
	public static void main(String[] args) {
		/* 국, 영, 수 점수 저장하고
		 * 네 과목의 합계(정수), 평균(실수)출력
		 * 평균 : double, float 둘 다 출력해주세요
		 */
		int kor = 88, eng = 98, math = 97, sum = (kor+eng+math);
		double avg1 = sum / 3.0;
		float avg2 = sum / 3.0F;
		
		System.out.println(sum);
		System.out.println(avg1);
		System.out.println(avg2);
	}
}
