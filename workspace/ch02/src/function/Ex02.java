package function;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		//function == method 함수 => java에서는 method라고 사용
		int[] arr = {1, 4, 3, 7, 2};
		int s = sum(arr); //배열의 합계
		System.out.println("배열의 합계 : " + s);
		
		sort(arr); //배열 오름차순 정렬
		print(arr); //배열의 값 확인
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
