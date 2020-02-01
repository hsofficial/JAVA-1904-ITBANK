package question;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayExceptionExample {
	public static void main(String[] args) {
		/* ������ 2ĭ¥�� �迭 ����
		 * for�ݺ������� �� �迭�� �����͸� 3�� �־��ּ���
		 * ����ó�����ּ���
		 */
		Scanner sc= new Scanner(System.in);
		int[] numArray = new int[2];
		try {
			for(int i = 0 ; i < 3 ; i++)
			{
				System.out.print(i + 1 + "��° �ƹ� ���ڳ� �Է�");
				numArray[i] = sc.nextInt();
				
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ������ �Ѿ���ϴ�.");
		} catch (InputMismatchException e) {
			System.out.println("���ڰ� �ƴմϴ�.");
		} catch(Exception e) {
			System.out.println("�� �� ���� �����Դϴ�.");
		}
	}
}
