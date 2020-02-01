package array;

import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		/* 아래 주어진 배열을 오름차순 정렬하시오
		 * arr = [2, 5, 1, 3, 6];
		 * 결과 = [1, 2, 3, 5, 6];
		 */
		int[] arr = {2, 5, 1, 3, 6};
		
		//선택, 삽입, 버블 => 원하는 걸로 사용
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
