package array;

import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		/* �Ʒ� �־��� �迭�� �������� �����Ͻÿ�
		 * arr = [2, 5, 1, 3, 6];
		 * ��� = [1, 2, 3, 5, 6];
		 */
		int[] arr = {2, 5, 1, 3, 6};
		
		//����, ����, ���� => ���ϴ� �ɷ� ���
		for(int i = 0; i < arr.length - 1 ; i ++) {
			for(int j = i + 1; j < arr.length; j ++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
