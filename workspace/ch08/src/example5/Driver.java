package example5;

public class Driver {
	//매개변수의 다형성 : 매개변수에 부모클래스의 객체가 있는 상태
	public void drive(Vehicle vehicle) {
		//vehicle 클래스는 bus, taxi class의 객체를 받을 수 있음
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
