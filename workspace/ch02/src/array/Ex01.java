package array;

public class Ex01 {
	public static void main(String[] args) {
		/* �迭(Array)
		 * �����͸� ������ ������ �� �ִ� ������ Ÿ��
		 * �迭�� ���̴� ����� �� ����.
		 */
		int len = 5;
		int[] score = new int[len]; //5ĭ¥�� �����迭 ����
//		int score2[] = new int[len]; �̷��� �������� ����� �մϴ�.
		//������ ���� ���� => ���ã��
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		score[4] = 50;
		int tmp = score[0] + score[4];
		System.out.println(tmp);
		for(int i = 0; i < len; i ++) {
			System.out.println("score[" + i + "] : " + score[i]);
		}
	}
}
