package setterGetter;

public class Car {
	//���� �ʵ�� private���� ���� ����
		private String ownerName;
		private String carName;
		private int price;
		
		//������(default)
		Car(String ownerName, String carName, int price){
			this.ownerName = ownerName;
			this.carName = carName;
			this.price = price;
		}
		
		//Setter, Getter : �����͸� �������� setter, �����͸� ���������� getter
		void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
		String getOwnerName() {
			return this.ownerName;
		}
		//�ʵ带 ���� private���� ���� => �� Ŭ���� ���ο����� ���ٰ���
		//�ùٸ� �����Ͱ� ������ �˻� �� �ֱ�
		void setPrice(int price) {
			if(price >= 0)
				this.price = price;
			else
				System.out.println("�߸��� �Է��Դϴ�.");
		}
}
