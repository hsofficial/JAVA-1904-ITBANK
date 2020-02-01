package example4;

public class FruitExample {
	public static void main(String[] args) {
		Fruit banana= new Fruit(5000, 500);
		banana.info();
		
		//info의 기능이 변경됨 => 오버라이딩
		WaterMelon wattermelon = new WaterMelon(15000, 1200);
		wattermelon.info();
	}
}
