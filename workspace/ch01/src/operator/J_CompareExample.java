package operator;

public class J_CompareExample {
	public static void main(String[] args) {
		char ch1 = 'A';
		int n1 = 65;
		
		System.out.println(ch1 == n1);//ASCII�ڵ�� ���� ���� ������
		
		//���Ҷ� �ڵ�����ȯ
		//�ڹٴ� float�� �����ϰ� ǥ���Ҷ� F�� �ٿ��ش�  => �Ⱥ��̸� doubleŸ��
		System.out.println(5 == 5.0); //5.0 == 5.0
		System.out.println(0.5 == 0.5F); //(double)0.5 == (float)0.5
		System.out.println(0.1 == 0.1F); //0.100000000129522
		//float 6�ڸ� double 15�ڸ� ����
		//�Ǽ����� �����ڸ� �ٷ� ������� �ƴ���
		
		int n2 = 1;
		double n3 = 0.1;
		System.out.println((int)(n3 * 10) == n2);
		
	}

}
