package example01;

public class D_CatchFinal {
	public static void main(String[] args) {
		/* try{
		 * 	���ܰ� �߻��� ���ɼ��� �ִ� ����
		 * }catch(Exception e){
		 * 	���� ó������
		 * }finally{
		 * 	������ �߻����ο� ������� �������� ����Ǵ� ����
		 * }
		 * try���� �޸��Ҵ��� �߾� �����޽����� ���� �پ��� ������ �ؾ߰���?
		 * finally���� �մϴ�.
		 */
		String[] name = new String[2];
		try {
			name[0] = "������";
			System.out.println("�̸� : " + name[0]);
			
			name[1] = "�۵���";
			System.out.println("�̸� : " + name[1]);
			
			name[2] = "�ۺ���";
			System.out.println("�̸� : " + name[2]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���� ���� �߻�");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally { //���ܰ� �߻��ǵ� �ȹ߻��ǵ� ������ ����Ǵ� ����
			System.out.println("�ý��� ����");
		}

	}

}
