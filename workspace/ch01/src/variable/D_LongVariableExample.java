package variable;

public class D_LongVariableExample {
	public static void main(String[] args) {
		
		//long 타입에 정수 리터럴을 저장할 때는 L(접미사)를 붙임.
		//리터럴 정수의 가독성을 위해 _로 읽기 쉽게 만들어줌.
		
		//int의 범위를 넘어가는 숫자(21억을 초과) => 리터럴 뒤에 L을 붙임
		//소문자l도 되지만 1과 헷갈리므로 대문자 L을 사용
		//정수의 기본타입 : int
		long var1 = 10_000_000_000_000_000L;
		long var2 = 10L;
				
		System.out.println(var1);
		System.out.println(var2);
		
	}
}
