package example4;

public class WaterMelon extends Fruit{
	double kg;
	
	WaterMelon(int price, double gram) {
		super(price, gram);
	}
	
	/* 메소드 재정의(Overriding) : 상위클래스의 메소드의 기능을 자식클래스에서 변경하는 방법
	 * 반환형 + 메소드명 + 매개변수개수 + 매개변수타입이 모두 동일해야된다.
	 * 부모에게 없는 메소드는 오버라이딩 할 수 없어요 => 새로운 메소드 선언
	 * 부모쪽에 없는 매개변수를 추가할 수도 없어요 => 틀이 아니라 기능을 변경(내용물)
	 * 
	 * @Override : 명시를 해주어 내가 만든 메소드인지 오버라이딩인지 구별
	 * 에러 줄이기
	 * 검사 > 오류 쉽게 발견
	 */
	
	@Override
	void info() {
		this.kg = super.gram * 0.001;
		System.out.printf("가격 : %d원, 무게 : %.2f(Kg)\n",this.price, this.kg);
	}
