package array;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		/* �Ǻ���ġ ������ �迭�� 10��° ĭ���� �����ϰ� ����Ͻÿ�
		 * �ݺ����� �̿��ؼ� ���� �� ���� ���� ���� ���� �迭�� �ϳ��� ���������� ����
		 * 
		 * [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
		 */
		int[] fibonacci = new int[10];
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		for(int i = 2; i < fibonacci.length; i ++) 
			fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
		System.out.println(Arrays.toString(fibonacci));
	}
}
