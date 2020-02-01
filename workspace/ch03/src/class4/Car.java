package class4;

public class Car {
	//생성자(Constructor) : 반환형이 없고, 클래스 이름과 동일한 메소드
	//객체 생성과 동시에 필드 값을 초기화 시킬 때
	
	String company = "Benz";
	String model;
	String color;
	int maxSpeed;
	
	/* 생성자 Overloading
	 * (in C) 함수 구별 > 식별자(이름)
	 * 똑같은 이름의 생성자가 매개변수의 개수 혹은 매개변수의 자료형이 다를 때
	 * 다른 생성자가 실행되도록 하는 기능
	 * 
	 * 디폴트 생성자 : 생성자를 정의하지 않으면 실행되는 생성자]
	 * 개발자가 생성자를 정의해 두었을 경우 매개변수가 없이는 객체가 생성되지 아니함
	 * 따라서 디폴트 생성자를 작성해 두는 것이 좋음
	 */
	Car(){} //디폴트 생성자 : 매개변수 없이도 객체를 만들어줌
	Car(String model){ //매개변수가 1개인 생성자
//		this.model = model;
		this(model, null, 0); //매개변수가 3개인 생성자 호출
	}
	Car(String model , String color){
//		this.model = model;
//		this.color = color;
		this(model, color, 0); //매개변수가 3개인 생성자 호출
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
