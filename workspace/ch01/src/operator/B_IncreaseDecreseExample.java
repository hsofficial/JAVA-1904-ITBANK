package operator;

public class B_IncreaseDecreseExample {
	public static void main(String[] args) {
		/* ����������
		 * ������ : ++, --
		 * �������� : �ش� ���ο��� ������ 1���� �Ǵ� ����
		 * �������� : ���� ���ο��� ������ 1���� �Ǵ� ����
		 */
		int a = 10, b = 10, c, d;
		c= a++;	//���� ����
		d= ++b;	//���� ����
		
		//println : ln(line) java ������� ����ϴµ� ����Ű �⺻������ ����
		//printf : c��� ���
		//print : java ����̳� ����Ű ������� ����
		
		System.out.println("a : " + a + ", b : " + b);
		System.out.println("c : " + c + ", d : " + d);
		System.out.printf("c���ó�� a : %d\n",a);
		System.out.print("a : " + a);
		System.out.print("b : " + b);
	}
}
