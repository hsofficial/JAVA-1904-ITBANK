package example5;

public class CoupeCar extends Car{
	//private ���� �Ұ� >>> �������̵� �Ұ�
	
	//final������ �ݵ�� �������̵�
	//����Ŭ������ �޼ҵ尡 final => ������ �ȵ� => �������̵� �Ұ���
	//final�� ����Ŭ���� ��ü�� �� ������ �ȴ� => �� ��� ����� �������̵��� �ȵ�
	
	@Override
	public final void ride() {
		System.out.println("2�ν¿� ź��.");
	}
}
