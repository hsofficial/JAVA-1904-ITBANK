package for_statememt;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		/* ȸ������ ���ϴ� ���α׷� ����
		 * ȸ���� : ���ڸ� �Ųٷ� �о ������ �д� �Ͱ� ���� ��
		 * 
		 * ���� �Է� : 12321
		 * ȸ���� �Դϴ�.
		 * 
		 * �����Է� : 12345
		 * ȸ������ �ƴմϴ�.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int tmp = num;
		int result = 0;
		//12321 => 0 + 1
		//1232 => 10 + 2
		//123 => 120 + 3
		//12 => 1230 + 2
		//1 => 12320 + 1
		for(;tmp > 0;) {
			result = result * 10 + tmp % 10;
			tmp /= 10;
		}
		if(num == result)
			System.out.println("ȸ���� ����");
		else
			System.out.println("ȸ���� �ƴ�");
		
	}
}
