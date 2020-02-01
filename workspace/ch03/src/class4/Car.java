package class4;

public class Car {
	//������(Constructor) : ��ȯ���� ����, Ŭ���� �̸��� ������ �޼ҵ�
	//��ü ������ ���ÿ� �ʵ� ���� �ʱ�ȭ ��ų ��
	
	String company = "Benz";
	String model;
	String color;
	int maxSpeed;
	
	/* ������ Overloading
	 * (in C) �Լ� ���� > �ĺ���(�̸�)
	 * �Ȱ��� �̸��� �����ڰ� �Ű������� ���� Ȥ�� �Ű������� �ڷ����� �ٸ� ��
	 * �ٸ� �����ڰ� ����ǵ��� �ϴ� ���
	 * 
	 * ����Ʈ ������ : �����ڸ� �������� ������ ����Ǵ� ������]
	 * �����ڰ� �����ڸ� ������ �ξ��� ��� �Ű������� ���̴� ��ü�� �������� �ƴ���
	 * ���� ����Ʈ �����ڸ� �ۼ��� �δ� ���� ����
	 */
	Car(){} //����Ʈ ������ : �Ű����� ���̵� ��ü�� �������
	Car(String model){ //�Ű������� 1���� ������
//		this.model = model;
		this(model, null, 0); //�Ű������� 3���� ������ ȣ��
	}
	Car(String model , String color){
//		this.model = model;
//		this.color = color;
		this(model, color, 0); //�Ű������� 3���� ������ ȣ��
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
