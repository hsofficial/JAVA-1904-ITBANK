package operator;

public class D_ArithmetricExample {
	public static void main(String[] args) {
		int cake = 1;
		double piece = 0.1;
		int eatNumber =8;	//내가 먹은 조각
		
		//1 - 0.1 * 8 => 0.2
		double remainCakes = cake - eatNumber * piece;
		System.out.println(remainCakes);
		
		/* 값이 0.2 안나오는 이유
		 * 컴퓨터에서는 실수를 정수와 마찬가지로 2진수로만 표현함
		 * IEEE Float형 부동소수점 방식
		 * 근사치로 계산
		 * 0.5 >>> 2^-1
		 * 0.25 >>> 2^-2
		 * 2^-1 + 2^-3
		 * 1/2 + 1/8 >>> 2의 승수는 딱 떨어지게 계산 가능하나 다른 경우는 근사치 출력
		 * 
		 * java는 절대로 실수를 바로 산술연산하지 아니함
		 */
		
	}
}
