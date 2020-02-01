package example01;

public class E_Throw {
	public static void main(String[] args) {
		/* 고의로 예외 발생시키기
		 * 1.new 연산자를 통해 발생키리려는 예외 클래스의 객체 생성
		 * 2.키워드 throw를 이용해 예외 발생
		 * Exception 인스턴스를 생성할 때 생성자에 String을 넣어주면
		 * String이 Exception 인스턴스에 메시지로 저장
		 * getMessage로 얻을 수 있다.
		 */
		try {
			Exception e = new Exception("고의로 발생");
			throw e;
		} catch (Exception e) {
			System.out.println("에러메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		/* RuntimeException : 프로그래머의 실수(컴파일시 오류x)
		 * IndexOutOfBoundExeption : 배열의 범위를 벗어남
		 * NullPointerException : 값이 null인 참조변수를 호출
		 * ArithmeticException : 내부 연산오류
		 * 
		 * Exception : 외부의 영향을 많이 받음(컴파일시 오류o)
		 * :사용자의 동작에 의해 발생하는 경우가 많음
		 * FileNotFoundException : 존재하지 않는 파일의 이름 입력
		 * DataFormatException : 입력한 데이터 형식이 잘못됨
		 * 반드시 예외 처리를 해줘야함
		 */
	}

}
