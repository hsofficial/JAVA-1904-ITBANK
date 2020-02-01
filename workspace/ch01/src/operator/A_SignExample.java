package operator;

public class A_SignExample {
	public static void main(String[] args) {
		/* 부호연산자
		 * 연산자 + 또는 -
		 * 양수 및 음수 표현
		 * 단항연산자로 사용될 경우는 부호
		 * 이항연산자로 사용될 경우는 산술연산자로 사용
		 * + : 피연산자 부호 유지
		 * - : 피연산자 부호 변경
		 */
		int var1 = -100;	//단항연산자
		int result1 = +var1;	//부호 유지
		System.out.println(var1);
		System.out.println(result1);
		
		short var2 = -100;
		//정수형(int) >>> short 변환시 강제형 변환 (casting)
		short result3 = (short) -var1;
		System.out.println(result3);
	}
}
