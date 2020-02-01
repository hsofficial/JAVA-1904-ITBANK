package operator;

import java.math.BigDecimal;

public class E_ArithmetricExample {
	public static void main(String[] args) {
		int cake = 1;
		int totalPiece = cake * 10; //10조각
		int eatNum = 8;
		int tmp = totalPiece - eatNum;	//2조각
		
		// 정수로 계산하고 마지막 소수점만 이동함
		// 실수의 기본 타입은 double, 정수의 기본 타입은 int
		double remainCakes = tmp / 10.0;	//0.2조각
		System.out.println(remainCakes);
		
		//실수를 바로 사용하려면 BigDecimal Class 이용
		//import 요구됨
		//반드시 쌍따옴표 붙여야 작동함
		BigDecimal b1 = new BigDecimal("1");
		BigDecimal b2 = new BigDecimal("-0.8");
		
		//add  메서드 : 객체끼리 더하기
		BigDecimal result = b1.add(b2);
		System.out.println(result);
		
	}
}
