package variable;

public class E_FloatVariableExample {
	public static void main(String[] args) {
		// CPU�� ����� ���� ���� �� �ִ� Ÿ�� : int, double
		//���� ���ͷ� : int
		//�Ǽ� ���ͷ� : double
		//F �ٿ��� float ���·� ����
		
		double var1 = 3.14;
		float var2 = 3.14F;
		
		System.out.println(var1);
		System.out.println(var2);
		
		var1 = 0.123456789123456789; //double
		var2 = 0.123456789123456789F; //float
		
		System.out.println(var1);
		System.out.println(var2);
		//float : 7�ڸ����� ��Ȯ�ϰ� ó��
		//double : 15�ڸ����� ��Ȯ�ϰ� ó��
		
		//���� : �ڸ����� �� �� ���ϰ� ǥ���Ϸ��� ��������
		//%e : ������ ǥ��
		//%g : �Ǽ��� ǥ���� �ϵ� �Ǽ� ������ �Ѿ�� ������ ǥ��
		//System.out.printf("%e, %g");
		
		double var3 = 12e3; //	12 * 10^3
		double var4 = 12e-3; // 12 * 10^-3(0.001)
		double var5 = 1.23e-3; // 1.23 * 10^-3
		
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}

}
