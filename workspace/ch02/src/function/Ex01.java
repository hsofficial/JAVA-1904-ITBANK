package function;

public class Ex01 {
	public static void main(String[] args) {
		//�ڵ尡 ����Ǵ� �Լ� => main�Լ�
		//C������ main�Լ����� �����ٰ� �Լ� ���� => JAVA�� ��������
		int []arr = {66, 55, 44, 11, 22};
		
		int m = max(arr);//�Լ��� ȣ��(���ڰ��� ����)
		System.out.println("�ִ밪 : " + m);
		m = min(arr);
		System.out.println("�ּҰ� : " + m);
	}
	private static int min(int[] param) {
		int m = param[0];
		for(int i = 1; i < param.length; i ++) {
			if(m > param[i])
				m = param[i];
		}
		return m;
	}
	//int : ��ȯ�ڷ���(return�� �������� �ڷ���)
	//max : �Լ� �̸�
	public static int max(int[] param) { //int[] param : �Ű�����
		int m = param[0];
		for(int i = 1; i < param.length; i ++) {
			if(m < param[i])
				m = param[i];
		}
		return m;
	}
}
