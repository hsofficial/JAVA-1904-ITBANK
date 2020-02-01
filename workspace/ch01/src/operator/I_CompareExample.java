package operator;

public class I_CompareExample {
	public static void main(String[] args) {
		/* 비교연산자
		 * 연산자 : <=, >=, <, >, ==, !=
		 * 파이썬 not : !
		 * 피연산자를 비교하여 boolean 타입의 값인 true 혹은 false 반환
		 * 주로 제어문에서 사용
		 * 
		 * c언어 boolean(T/F) 를 쓰려면 헤더를 추가
		 * 
		 */
		int n1 = 10, n2 = 10, n3 = 15;
		boolean result1 = (n1 == n2);
		boolean result2 = (n1 == n3);
		boolean result3 = (n1 != n3);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(!result3);
	}
}
