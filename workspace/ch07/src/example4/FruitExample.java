package example4;

public class FruitExample {
	public static void main(String[] args) {
		Fruit banana= new Fruit(5000, 500);
		banana.info();
		
		//info�� ����� ����� => �������̵�
		WaterMelon wattermelon = new WaterMelon(15000, 1200);
		wattermelon.info();
	}
}
