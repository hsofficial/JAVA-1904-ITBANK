package example01;

public class C_CatchBlock {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}  catch (ArithmeticException e) {
			System.out.println("ArithmeticException�߻�");
			//printStackTrace : ���� �߻� ����� ȣ�⽺�ÿ� �ִ� �޼ҵ��� ������ ���� �޽����� ȭ�鿡 ���
			e.printStackTrace();
			//getMessage() : �߻��� ����Ŭ������ �ν��Ͻ��� ����� �޽��� ����
			System.out.println(e.getMessage());
			System.out.println(4);
			//Exception >> Object�� ������(����Ŭ������ �ֻ��� Ŭ����)
		} catch(Exception e) { //ArithmeticException���ܸ� ������ ��� ����ó��
			System.out.println("Exception");
		}
	}
}
