package class6;

public class Rectangle {
	/* Method Overloading
	 * 메소드명이 같아도 다른 기능을 할 수 있음
	 * 매개변수의 타입 또는 개수가 다른 경우 메소드명 중복 허용
	 * 반환형은 인식하지 아니함(반환형과는 무관)
	 */
	double area(double width) { //정사각형의 넓이를 구하는 메소드(double)
		return width * width;
	}
	int area(int width) { //정사각형의 넓이를 구하는 메소드(int)
		return width * width;
	}
//	double area(int width) { //매개변수가 달라야 오버로딩가능 (반환형은 상관없다)
//		return (double)width * width;
//	}
	double area(double width, double height) { //직사각형의 넓이를 구하는 메소드
		return width * height;
	}
}
