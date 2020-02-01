package array;

import java.util.Arrays;

public class Ex08 {
	public static void main(String[] args) {
		/* ���� ���� - �迭�� �����ϴ� ��� �����ּҸ� ����
		 * ���� ���� - �迭�� �����ϴ� ��� �����Ͱ� ����
		 */
		int[] arr = {3, 1, 6, 2, 4, 7};
		int[] copy = arr; //���Կ����� : ���� ����
		copy[1] = 99; //copy�� ��Ҹ� �ǵ���� arr�� ��Ұ� �ٲ�ϴ�. => ���� �ּ�
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copy : " + Arrays.toString(copy));
		
		arr = new int[] {3, 1, 6, 2, 4, 7};
		copy = new int[arr.length]; //������ �迭�� ���̸�ŭ �迭 ����
		
		//System.arraycopy(�����迭, ��������ε���, �����ҹ迭, �����ҹ迭�����ε���, �����ҵ����Ͱ���)
		System.arraycopy(arr, 0, copy, 0, arr.length);
		copy[1] = 99;
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copy : " + Arrays.toString(copy));
	}
}