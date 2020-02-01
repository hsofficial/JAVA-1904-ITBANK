package operator;

public class M_ThreeExample {
	public static void main(String[] args) {
		/* 조건연산자
		 * a++; 단항연산자
		 * a + b; 이항연산자
		 * a ? b : c; 삼항연산자
		 * (조건식) ? 참 : 거짓;
		 */
		
		int score = 95;
		char grade = (score > 90) ? 'A' : 'B';
		System.out.println(grade);
		
		//경우의 수가 많아지면 코드가 길고 번잡해짐 - 세가지나 두가지일 경우만 사용
		score = 81;
		grade = (score > 90) ? 'A' : (score > 80) ? 'B' : 'C';
		System.out.println(grade);
		
	}
}
