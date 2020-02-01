package operator;

public class L_LogicExample {
	public static void main(String[] args) {
		/* 논리연산자
		 * !, && 또는 &, || 또는 |
		 * 파이썬 and(&&), or(||)
		 * 피연산자는 boolean타입의 값만 올 수 있다.
		 */
		boolean flag = true;
		System.out.println(flag);
		
		flag = !flag;
		System.out.println(flag);
		
		int n = 6;
		
		//&& : 논리곱(AND) : 모든 피연산자가 true여야 true
		if((n > 0) && (n <= 100)) {
			System.out.println("1 ~ 100사이의 숫자입니다.");
		}
		
		//|| : 논리합(OR) : 모든 피연산자가 false여야 false
		if((n % 2 == 0) || (n % 3 == 0)) {
			System.out.println(n + "는 2 또는 3의 배수");
		}
		
		//&&연산자는 조건식이 하나라도 false이면 거짓 => 뒤에 조건식 볼 필요없다
		//||연산자는 조건식이 하나라도 true이면 참 => 뒤에 조건식 볼 필요없다
		//|, & 를 하나만 적으면 모든 피연산자를 무조건 다 계산
		//CPU의 연산속도가 더 느려짐
		if((n % 2 == 0) | (n % 3 == 0)) {
			System.out.println(n + "는 2 또는 3의 배수");
		}
		
	}
}
