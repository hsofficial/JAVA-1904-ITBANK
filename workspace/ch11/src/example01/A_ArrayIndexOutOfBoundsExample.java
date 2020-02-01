package example01;

public class A_ArrayIndexOutOfBoundsExample {
	//String[] args :  �Ű����� >> main �Լ��� ȣ���� �� �־��ִ� �Ű�����
	//run configurations�� �ִ� arguments�� ���� �־��ָ� �Ű������� ����
	//1 3 => args[0] = 1; args[1] = 3
	//args[2]�迭�� �ȴ�
	public static void main(String[] args) {
		try {// ���ܰ� �߻��� �� ���� �ڵ带 try ��Ͽ� �־���
			String data1 = args[0];
			String data2 = args[1];
			
			//ArrayIndexOutOfBoundsException������ ���ܰ� �߻�
			//catch�޼ҵ忡�� ArrayIndexOutOfBoundsException������ ���ڸ� ����
			String data3 = args[2]; //���� �ε��� ����
			int num1 = Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);
			System.out.println(num1 + num2);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ������ ������ϴ�.");
		}
		catch(Exception e) {
			System.out.println("�� �� ���� �����Դϴ�.");
		}
	}
}
