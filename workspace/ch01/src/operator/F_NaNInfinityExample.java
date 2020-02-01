package operator;

public class F_NaNInfinityExample {
	public static void main(String[]args) {
			//NaN : Not a Number : 숫자가 아니다.
			//Infinity : 무한대
			
			//ctrl + / : 주석처리
			//피젯수 / 젯수
			//젯수가 0이면 나누기 연산 불가
			
			int a = 5, b= 0;
//			try {	//임의로 error 발생
				int result = a / b;
				System.out.println(result);
//			}catch(ArithmeticException e) {
//				System.out.println("0으로 나누기 불가능");
//			}
	}

}
