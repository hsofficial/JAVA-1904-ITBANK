package setterGetter;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car("ȫ�浿", "E-class", 8000);
//		car1.ownerName = "�۵���"; private�̶� ������ �ȵ�
		car1.setOwnerName("dlwlrma");
		System.out.println(car1.getOwnerName());
		car1.setPrice(-500);
		car1.setPrice(5000);
	}
}
