package array;

import java.util.Arrays;

public class Ex16 {
	public static void main(String[] args) {
		//�ڹ��� 2���� �迭�� ��ܽ� ������ ���� �� �ִ�.(�ึ�� �ٸ� ���� ������ �� �� �ִ�.)
		int [][]arr = new int[3][]; //3��¥�� �迭����
		arr[0] = new int[4];
		arr[1] = new int[2];
		arr[2] = new int[3];
		int cnt = 0;
		for(int i = 0; i < arr.length; i ++) {
			for(int j = 0; j < arr[i].length; j ++) {
				arr[i][j] = ++cnt;
			}
		}
		for(int i = 0 ; i < arr.length; i ++)
			System.out.println(Arrays.toString(arr[i]));
	}
}
