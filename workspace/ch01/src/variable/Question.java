package variable;

public class Question {
	public static void main(String[] args) {
		/* ��, ��, �� ���� �����ϰ�
		 * �� ������ �հ�(����), ���(�Ǽ�)���
		 * ��� : double, float �� �� ������ּ���
		 */
		int kor = 88, eng = 98, math = 97, sum = (kor+eng+math);
		double avg1 = sum / 3.0;
		float avg2 = sum / 3.0F;
		
		System.out.println(sum);
		System.out.println(avg1);
		System.out.println(avg2);
	}
}
