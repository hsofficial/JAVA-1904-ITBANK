package class4;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.model = "E-class";
		car1.color = "silver";
		car1.maxSpeed = 250;
		
		Car car2 = new Car("E-class");
		car2.color = "silver";
		car2.maxSpeed = 250;
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxSpeed);
		
		Car car3 = new Car("E-class","silver");
		car3.maxSpeed = 250;
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println(car3.maxSpeed);
		
	}

}
