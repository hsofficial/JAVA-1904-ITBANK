package for_statememt;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		/* 1 ~ 10������ ���� �� �� 5ȸ, ȸ�� 10���� ���ڸ� �̾�����
		 * �Է¹��� ���ڰ� �� �� �������� ������ּ���
		 * 
		 * �����Է� : 7
		 * 1ȸ : 0��
		 * 2ȸ : 1��
		 * 3ȸ : 0��
		 * 4ȸ : 3��
		 * 5ȸ : 2��
		 * 
		 * 7�� �� 6�� ���Խ��ϴ�.
		 * ���� for�� Ȱ��
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1���� 10������ �Ǽ� �Է� : ");
		int num = sc.nextInt();
		int total = 0;
		
		for(int i = 1; i <= 5; i++) {
			int cnt = 0;	//ȸ�� �p��
			for(int j = 1; j <= 10; j++) {
				int rand = (int)(Math.random() * (11 - 1) + 1);
					if(num == rand) {
						cnt ++;
					}
			}
			System.out.println(i + "ȸ : " + cnt);
			total += cnt;
		}
		System.out.println(num + "�� ��" + total +"�� ����");
	}
}
