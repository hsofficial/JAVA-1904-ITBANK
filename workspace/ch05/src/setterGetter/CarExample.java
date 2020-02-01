package setterGetter;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car("홍길동", "E-class", 8000);
//		car1.ownerName = "송동열"; private이라서 접근이 안됨
		car1.setOwnerName("dlwlrma");
		System.out.println(car1.getOwnerName());
		car1.setPrice(-500);
		car1.setPrice(5000);
	}
}
