package operator;

public class D_ArithmetricExample {
	public static void main(String[] args) {
		int cake = 1;
		double piece = 0.1;
		int eatNumber =8;	//���� ���� ����
		
		//1 - 0.1 * 8 => 0.2
		double remainCakes = cake - eatNumber * piece;
		System.out.println(remainCakes);
		
		/* ���� 0.2 �ȳ����� ����
		 * ��ǻ�Ϳ����� �Ǽ��� ������ ���������� 2�����θ� ǥ����
		 * IEEE Float�� �ε��Ҽ��� ���
		 * �ٻ�ġ�� ���
		 * 0.5 >>> 2^-1
		 * 0.25 >>> 2^-2
		 * 2^-1 + 2^-3
		 * 1/2 + 1/8 >>> 2�� �¼��� �� �������� ��� �����ϳ� �ٸ� ���� �ٻ�ġ ���
		 * 
		 * java�� ����� �Ǽ��� �ٷ� ����������� �ƴ���
		 */
		
	}
}
