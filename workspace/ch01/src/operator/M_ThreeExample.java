package operator;

public class M_ThreeExample {
	public static void main(String[] args) {
		/* ���ǿ�����
		 * a++; ���׿�����
		 * a + b; ���׿�����
		 * a ? b : c; ���׿�����
		 * (���ǽ�) ? �� : ����;
		 */
		
		int score = 95;
		char grade = (score > 90) ? 'A' : 'B';
		System.out.println(grade);
		
		//����� ���� �������� �ڵ尡 ��� �������� - �������� �ΰ����� ��츸 ���
		score = 81;
		grade = (score > 90) ? 'A' : (score > 80) ? 'B' : 'C';
		System.out.println(grade);
		
	}
}
