package ch08;

public class TimeExample {
	public static void main(String[] args) {
		String str = new String("�����");
		String str2 = new String("������");
		if(str.equals(str2))	//����Ÿ���� �ּҷ� ��
			System.out.println("���ƿ�");
		else
			System.out.println("�޶��");
		
		Time aPlan = new Time(3, 30, 0);
		Time bPlan = new Time(3, 30, 0);
		
		//Object.equals() : ���Ŭ������ ObjectŬ������ ��ӹ޾ƿ�
		//���� �˰��ִ� Ÿ���� ���빰�� ��(�⺻Ÿ��) => String, Integer
		
		if(aPlan.equals(bPlan)) {
			System.out.println("���ƿ�");
		}
		else {
			System.out.println("�޶��");
		}
	}
}
