package input;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		/*
		 * ������ �Է� >>> �հ�(����) ���(�Ǽ�)���
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� �Է� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� ���� �Է� : ");
		int eng = sc.nextInt();
		
		System.out.print("���� ���� �Է� : ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		
		double avg = (double)sum/3.0;
				
		System.out.println(sum);
		System.out.println(avg);
		
		//#�� �������� 0�� ������ ǥ��
		//3.140 => "#,###" => 3.14
		//3.140 => "0,000" => 3.140
		
		DecimalFormat df = new DecimalFormat("#,##");	//�Ҽ����� �ִ� ���ڸ����� ���
//		DecimalFormat df = new DecimalFormat("#.00"); //�Ҽ����� ������ ���ڸ����� ���
//		DecimalFormat df = new DecimalFormat("#.###"); //õ���� ���б�ȣ ���
		String a = df.format(avg);
		System.out.println("��� : " + a);
		
		sc.close();
	}
}
