package operator;

public class I_CompareExample {
	public static void main(String[] args) {
		/* �񱳿�����
		 * ������ : <=, >=, <, >, ==, !=
		 * ���̽� not : !
		 * �ǿ����ڸ� ���Ͽ� boolean Ÿ���� ���� true Ȥ�� false ��ȯ
		 * �ַ� ������� ���
		 * 
		 * c��� boolean(T/F) �� ������ ����� �߰�
		 * 
		 */
		int n1 = 10, n2 = 10, n3 = 15;
		boolean result1 = (n1 == n2);
		boolean result2 = (n1 == n3);
		boolean result3 = (n1 != n3);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(!result3);
	}
}
