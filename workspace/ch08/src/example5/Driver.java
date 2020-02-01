package example5;

public class Driver {
	//�Ű������� ������ : �Ű������� �θ�Ŭ������ ��ü�� �ִ� ����
	public void drive(Vehicle vehicle) {
		//vehicle Ŭ������ bus, taxi class�� ��ü�� ���� �� ����
		vehicle.run();
	}
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
