package example01;

public class B_TryCatch {
	public static void main(String[] args) {
		/* 예외처리 : 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 오류 작성
		 * : 프로그램의 비정상적 종료를 방지하고 정상적인 실행상태를 유지
		 * error - 메모리가 부족, 스택오버플로우 발생(fatal error)
		 * exception - 프로그램상 오류(발생하더라도 수정이 가능함)
		 *일반예외 - 컴파일 과정에서 발생
		 *실행예외 - 런타임 과정에서 발생
		 */
		int num = 100;
		int result = 0;
		
		//java는 정수를 0으로 나누면 ArithmeticException - 산술연산 오류
		//실수는 0이나 0.0으로 나누어도 발생하지 않음
		//alt shift z >>> try catch문 자동생성
		try {
			for(int i = 0; i < 10; i ++) {
				result = num / (int)(Math.random() * 5); //0 ~ 4
				System.out.println(result);
			}
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		}
		
		String data = null;
		try {
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			System.out.println("객체에 null이 저장되어 메소드를 사용할 수 없습니다.");
		}
		
	}

}
