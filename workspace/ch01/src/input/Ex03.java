package input;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/* 두 수를 입력받을 건데 첫 번째 수는 실수로 입력, 두 번째 수는 정수로 입력
		 * 두 수의 곱셈(정수)과 나눗셈(실수) 결과 출력
		 * Double.parseDouble(); => string에서 변환
		 * sc.nextDouble(); => 바로 입력
		 */
		Scanner sc = new Scanner(System.in);
		
		//nextLine() : 엔터키(개행문자)로 입력을 구분
		//next() : 스페이스바, 엔터키로 입력을 구분
		
		System.out.print("실수 입력 : ");
		double d1 = sc.nextDouble();
		// \n 문자를 가지고 가지 않아 버퍼에 남음
		
		sc.nextLine();
		//\n 문자를 받아줌
		
		System.out.print("정수 입력 : ");
		String s2 = sc.nextLine();
		int i2 = Integer.parseInt(s2);
		
		System.out.println((int)(d1 * i2));
		System.out.println(d1 / i2);
	}
}
