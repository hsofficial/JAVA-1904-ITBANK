package question;

public class MovieExample {
	public static void main(String[] args) {
		/* ����, ����, ������, ���ŵ���� �����ϴ� MovieŬ���� ����
		 * ������ ������ ���� �ٸ� �����ڰ� ����ǵ��� �����ε��Ͻÿ�
		 * printfInfo()�޼ҵ带 ����� �ʵ��� �����͸� ��µǰ� �Ͻÿ�
		 */
		//String, double, String, int
		Movie m1 = new Movie("����̾� ���ҵ�", 9.5,"2018-10-31", 1);
		m1.printInfo();
		
		Movie m2 = new Movie("�ź��� ������� �׸����е��� ����", 7.74);//String, double
		m2.printInfo();
		
		Movie m3 = new Movie("����� �������");//String
		m3.printInfo();
	}
}