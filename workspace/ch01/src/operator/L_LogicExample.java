package operator;

public class L_LogicExample {
	public static void main(String[] args) {
		/* ��������
		 * !, && �Ǵ� &, || �Ǵ� |
		 * ���̽� and(&&), or(||)
		 * �ǿ����ڴ� booleanŸ���� ���� �� �� �ִ�.
		 */
		boolean flag = true;
		System.out.println(flag);
		
		flag = !flag;
		System.out.println(flag);
		
		int n = 6;
		
		//&& : ����(AND) : ��� �ǿ����ڰ� true���� true
		if((n > 0) && (n <= 100)) {
			System.out.println("1 ~ 100������ �����Դϴ�.");
		}
		
		//|| : ����(OR) : ��� �ǿ����ڰ� false���� false
		if((n % 2 == 0) || (n % 3 == 0)) {
			System.out.println(n + "�� 2 �Ǵ� 3�� ���");
		}
		
		//&&�����ڴ� ���ǽ��� �ϳ��� false�̸� ���� => �ڿ� ���ǽ� �� �ʿ����
		//||�����ڴ� ���ǽ��� �ϳ��� true�̸� �� => �ڿ� ���ǽ� �� �ʿ����
		//|, & �� �ϳ��� ������ ��� �ǿ����ڸ� ������ �� ���
		//CPU�� ����ӵ��� �� ������
		if((n % 2 == 0) | (n % 3 == 0)) {
			System.out.println(n + "�� 2 �Ǵ� 3�� ���");
		}
		
	}
}
