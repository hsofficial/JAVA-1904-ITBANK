package example01;

public class B_TryCatch {
	public static void main(String[] args) {
		/* ����ó�� : ���α׷� ���� �� �߻��� �� �ִ� ������ �߻��� ����� ���� �ۼ�
		 * : ���α׷��� �������� ���Ḧ �����ϰ� �������� ������¸� ����
		 * error - �޸𸮰� ����, ���ÿ����÷ο� �߻�(fatal error)
		 * exception - ���α׷��� ����(�߻��ϴ��� ������ ������)
		 *�Ϲݿ��� - ������ �������� �߻�
		 *���࿹�� - ��Ÿ�� �������� �߻�
		 */
		int num = 100;
		int result = 0;
		
		//java�� ������ 0���� ������ ArithmeticException - ������� ����
		//�Ǽ��� 0�̳� 0.0���� ����� �߻����� ����
		//alt shift z >>> try catch�� �ڵ�����
		try {
			for(int i = 0; i < 10; i ++) {
				result = num / (int)(Math.random() * 5); //0 ~ 4
				System.out.println(result);
			}
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� ����");
		}
		
		String data = null;
		try {
			System.out.println(data.toString());
		} catch (NullPointerException e) {
			System.out.println("��ü�� null�� ����Ǿ� �޼ҵ带 ����� �� �����ϴ�.");
		}
		
	}

}
