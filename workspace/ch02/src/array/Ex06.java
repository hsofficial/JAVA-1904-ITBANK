package array;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		/* �Ʒ� �迭�� ����� ���� �������� ���� �˰����� �ۼ��Ͻÿ�
		 * (Math.random()�޼ҵ带 ���)
		 */
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		/* swap�˰���
		 * int tmp = num1;
		 * num2 = num2;
		 * num2 = tmp;
		 */
		for(int i = 0; i < numbers.length; i ++) {
			int r = (int)(Math.random() * 9);// 0 ~ 8 => �ε�����ȣ
			int tmp = numbers[i];
			numbers[i] = numbers[r];
			numbers[r] = tmp;
		}
		System.out.println(Arrays.toString(numbers));
	}
}
