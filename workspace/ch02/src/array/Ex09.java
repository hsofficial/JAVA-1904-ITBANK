package array;

import java.util.Arrays;

public class Ex09 {
	public static void main(String[] args) {
		/*1.45���� ���̸� ���� int�� �迭 ����
		 * �ݺ����� �̿��� 1 ~ 45�� �迭�� ���ҿ� ���������� ����
		 */
		int[] numbers = new int[45];
		for(int i = 0; i < numbers.length; i ++)
			numbers[i] = i + 1;
		
		//2.�� �迭�� ����� ���� �������� �����ּ���
		//Ex06����
		for(int i = 0; i < numbers.length;i ++) {
			int r = (int)(Math.random() * 45); // 0 ~ 44 �� �ε�����ȣ ����
			int tmp = numbers[i];
			numbers[i] = numbers[r];
			numbers[r] = tmp;
		}
		System.out.println(Arrays.toString(numbers));
		//3.���� �迭[45]���� 0��° �ε������� 6���� lotto[]�迭�� ���� ����
		
		int[] lotto = new int[6];
		System.arraycopy(numbers, 0, lotto, 0, 6);
		System.out.println(Arrays.toString(lotto));
		
		//4.�ζ� �迭�� �������� �����ϼ���
		for(int i = 0; i < lotto.length - 1;  i ++) {
			for(int j = i + 1; j < lotto.length; j ++) {
				if(lotto[i] > lotto[j]) {
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
}
