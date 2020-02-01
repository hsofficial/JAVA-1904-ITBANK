package example4;

public class Fruit {
	//오버로딩 : 매개변수에 따라 다른 메소드가 실행되는 것
	//오버라이딩 : 기존의 메소드에 다른기능을 추가
	
	int price;
	double gram;
	
	Fruit(int price, double gram){
		this.price = price;
		this.gram = gram;
	}
	void info() {
		System.out.printf("가격 : %d원, 무게 : %.2f(g)\n",this.price, this.gram);
	}
}
