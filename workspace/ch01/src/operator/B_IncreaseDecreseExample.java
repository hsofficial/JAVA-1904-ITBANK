package operator;

public class B_IncreaseDecreseExample {
	public static void main(String[] args) {
		/* 증감연산자
		 * 연산자 : ++, --
		 * 전위증감 : 해당 라인에서 변수를 1증가 또는 감소
		 * 후위증감 : 다음 라인에서 변수를 1증가 또는 감소
		 */
		int a = 10, b = 10, c, d;
		c= a++;	//후위 증감
		d= ++b;	//전위 증감
		
		//println : ln(line) java 방식으로 출력하는데 엔터키 기본적으로 붙임
		//printf : c언어 방식
		//print : java 방식이나 엔터키 적용되지 않음
		
		System.out.println("a : " + a + ", b : " + b);
		System.out.println("c : " + c + ", d : " + d);
		System.out.printf("c언어처럼 a : %d\n",a);
		System.out.print("a : " + a);
		System.out.print("b : " + b);
	}
}
