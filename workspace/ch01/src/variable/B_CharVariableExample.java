package variable;

public class B_CharVariableExample {
	public static void main(String[] args) {
		/*���α׷��� > ����� �������� ���
		 * char 1byte >>> ���ĺ� ����
		 * java�� char 2byte
		 * ascii > ��� ���� �ٲٱ� ���� ��Ģ
		 * OS / Language / SW ������� ���ڸ��� ������ �ڵ尪 ����
		 * �����ڵ� > ��� ��� ��ȯ�ϱ� ���� ���� �ڵ�ü��
		 * 16bit�� ��� ���� ǥ�� / �ִ� 65536�� ���� ǥ�� ����
		 * https://www.unicode.org/charts/PDF/U0000.pdf
		 * http://www.unicode.org/charts/PDF/UAC00.pdf
		 */
		
		char var1 = 'N';
		char var2 = 78;
		char var3 = '\u004E';
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		char var4 = '��';
		char var5 = '\uB098';
		
		System.out.println(var4);
		System.out.println(var5);
		
	}
}
