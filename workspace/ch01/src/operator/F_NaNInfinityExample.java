package operator;

public class F_NaNInfinityExample {
	public static void main(String[]args) {
			//NaN : Not a Number : ���ڰ� �ƴϴ�.
			//Infinity : ���Ѵ�
			
			//ctrl + / : �ּ�ó��
			//������ / ����
			//������ 0�̸� ������ ���� �Ұ�
			
			int a = 5, b= 0;
//			try {	//���Ƿ� error �߻�
				int result = a / b;
				System.out.println(result);
//			}catch(ArithmeticException e) {
//				System.out.println("0���� ������ �Ұ���");
//			}
	}

}
