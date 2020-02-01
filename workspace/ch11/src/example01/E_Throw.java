package example01;

public class E_Throw {
	public static void main(String[] args) {
		/* ���Ƿ� ���� �߻���Ű��
		 * 1.new �����ڸ� ���� �߻�Ű������ ���� Ŭ������ ��ü ����
		 * 2.Ű���� throw�� �̿��� ���� �߻�
		 * Exception �ν��Ͻ��� ������ �� �����ڿ� String�� �־��ָ�
		 * String�� Exception �ν��Ͻ��� �޽����� ����
		 * getMessage�� ���� �� �ִ�.
		 */
		try {
			Exception e = new Exception("���Ƿ� �߻�");
			throw e;
		} catch (Exception e) {
			System.out.println("�����޽��� : " + e.getMessage());
			e.printStackTrace();
		}
		/* RuntimeException : ���α׷����� �Ǽ�(�����Ͻ� ����x)
		 * IndexOutOfBoundExeption : �迭�� ������ ���
		 * NullPointerException : ���� null�� ���������� ȣ��
		 * ArithmeticException : ���� �������
		 * 
		 * Exception : �ܺ��� ������ ���� ����(�����Ͻ� ����o)
		 * :������� ���ۿ� ���� �߻��ϴ� ��찡 ����
		 * FileNotFoundException : �������� �ʴ� ������ �̸� �Է�
		 * DataFormatException : �Է��� ������ ������ �߸���
		 * �ݵ�� ���� ó���� �������
		 */
	}

}
