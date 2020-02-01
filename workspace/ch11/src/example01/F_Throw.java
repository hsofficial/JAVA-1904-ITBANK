package example01;

public class F_Throw {
	public static void main(String[] args) {
		//�޼ҵ带 ����Ҷ� ����ó���� �ؾ� ����� �� �ְ� ������� �޼ҵ���� �־��
		try {
			findClass();			
		}catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ ã�� �� �����ϴ�.");
		}catch(InstantiationException e) {
			
		}catch(IllegalAccessException e) {
			
		}
	}
	/* 1.�� ���ܻ�Ȳ���� �������� ó������� �ʿ��� �� ���
	 * 
	 * 2.��������� ���ܸ� Ȯ���ϱ� ���ؼ�
	 * �޼ҵ� �����ٰ� throws ClassNotFoundException �� �޼ҵ忡�� �̷� ���ܰ� �߻��Ұž�~
	 * 
	 * 3.�ش� �κ��� �ҽ��� �ܼ�ȭ �ϰ������
	 * ����ó�� �ڵ尡 �ʹ� ������� �޼ҵ带 ���� �ٸ� ������ ��������.
	 */
	
	
	//findClass()�� ȣ���� main�޼ҵ�� ClassNotFoundException�� �����ٰž�~
	private static void findClass() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//Class Ŭ������ forName�޼ҵ� 
		//�����ϴ� Ÿ���̸� �� Ŭ������ ��ü���¸� ��ȯ
		String name1 = "����";
		Class obj = Class.forName("java.lang.String");
		String name = obj.getName();	//Ŭ������ �̸��� ��ȯ�ϴ� �޼ҵ�
		//newInstance : Ŭ���������� ��ü�� ������ִ� �޼ҵ�
		String str = (String)obj.newInstance();
		str = "����";
		System.out.println(str);
	}
}
