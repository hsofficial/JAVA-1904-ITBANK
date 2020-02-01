package function;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		//function == method �Լ� => java������ method��� ���
		int[] arr = {1, 4, 3, 7, 2};
		int s = sum(arr); //�迭�� �հ�
		System.out.println("�迭�� �հ� : " + s);
		
		sort(arr); //�迭 �������� ����
		print(arr); //�迭�� �� Ȯ��
	}

	private static void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr) {
		for(int i = 0; i < arr.length - 1 ; i ++) {
			for(int j = i + 1; j < arr.length; j ++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	private static int sum(int[] arr) {
		int s = 0;
		for(int i = 0; i < arr.length; i ++)
			s += arr[i];
		return s;
	}
	
}
