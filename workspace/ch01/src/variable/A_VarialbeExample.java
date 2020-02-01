package variable;

public class A_VarialbeExample {
	public static void main(String[] args) {
		//변수 : 변하는 수
		//상수 : 항'상' 변하지 않는 '수'
		//상수는 관례적으로 전부 대문자로 적는다
		
		final int MAX = 100;
		//MAX = 50;
		//MAX에 넣은 100이라는 숫자 => 리터럴
		//100은 정수 리터럴, 3.14는 실수 리터럴, 'A'문자 리터럴
		System.out.println(MAX);
		
		int num1 = 10, num2 = 20;
		int tmp = num1;	//덮어 쓰여질 것을 저장함
		num1 = num2;
		num2 = tmp;
	}

}
