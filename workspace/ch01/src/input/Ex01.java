package input;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/* C����� scanf()
		 * ���̽��� input()
		 * �ڹ� 5���� ���Ŀ� ���� Scanner��ü�� ���
		 * 5���� ������ bufferedreader => �ڵ尡 ��� ������
		 */
		
		//1.��ĳ��(�Է�) ��ü �ۼ�(ctrl + shift + o)
		//System.in : ǥ�� �Է� ��Ʈ�� : Ű���� �Է��� �޾��ִ� ��Ʈ��
		//stream : �帧 : ����, http������, Ű�����Է� : ó���� ���� �ִ� �����͵�
		Scanner scan = new Scanner(System.in);

		//2. ��ĳ�� ��ü�� �Է� �޼ҵ� ���
		System.out.print("���ڿ� �Է� : ");
		String s1 = scan.nextLine();
		System.out.println("�Էµ� ���ڿ� : " + s1);
		
		//3.�Է� ��ü ����(�������� ������ ���ۿ� �ٸ� ���� ���� �� ����)
		scan.close();
		/*�Ⱦ��� �޸� ������ �˾Ƽ� ����
		 * java, py >>> Garbage Collector
		 * System.gc(); => Garbage Collector �������� ��ɾ�
		 */
	}
}
