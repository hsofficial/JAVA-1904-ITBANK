package Random;

public class Ex01 {
	public static void main(String[] args) {
		//C���� 0 ~ 32767������ ���ڰ� �������� ��ȯ 
		//rand() % 100 => 0 ~ 99
		//0.0 <= Math.random() < 1.0 ������ ���ڰ� �������� ����(�Ǽ�)
		//0.000000000 <= r < 0.999999999
		double r = Math.random();	//math ���� ���� �޼��� ����ִ� Ŭ����
		System.out.println(r);
		System.out.println((int)(Math.random() * 10));	//0~9
		System.out.println((int)(Math.random() * 10) + 1);	//1~10
		
		//0 ~ 50 + 50 => 50 ~ 100
		//Math.random() * 51 => 0 ~ 50 + 50 => 50 ~ 100
		//(Math.random() * (�ִ�������� +1 - �ּҹ�������) + �ּҹ�������)
		System.out.println((int)(Math.random() * (101 - 50) + 50));
		
	}
}
