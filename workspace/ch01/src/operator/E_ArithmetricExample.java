package operator;

import java.math.BigDecimal;

public class E_ArithmetricExample {
	public static void main(String[] args) {
		int cake = 1;
		int totalPiece = cake * 10; //10����
		int eatNum = 8;
		int tmp = totalPiece - eatNum;	//2����
		
		// ������ ����ϰ� ������ �Ҽ����� �̵���
		// �Ǽ��� �⺻ Ÿ���� double, ������ �⺻ Ÿ���� int
		double remainCakes = tmp / 10.0;	//0.2����
		System.out.println(remainCakes);
		
		//�Ǽ��� �ٷ� ����Ϸ��� BigDecimal Class �̿�
		//import �䱸��
		//�ݵ�� �ֵ���ǥ �ٿ��� �۵���
		BigDecimal b1 = new BigDecimal("1");
		BigDecimal b2 = new BigDecimal("-0.8");
		
		//add  �޼��� : ��ü���� ���ϱ�
		BigDecimal result = b1.add(b2);
		System.out.println(result);
		
	}
}
