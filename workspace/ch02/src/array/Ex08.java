package array;

import java.util.Arrays;

public class Ex08 {
	public static void main(String[] args) {
		/* 얕은 복사 - 배열을 복사하는 경우 참조주소만 복사
		 * 깊은 복사 - 배열을 복사하는 경우 데이터가 복사
		 */
		int[] arr = {3, 1, 6, 2, 4, 7};
		int[] copy = arr; //대입연산자 : 얕은 복사
		copy[1] = 99; //copy의 요소를 건드려도 arr의 요소가 바뀝니다. => 같은 주소
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copy : " + Arrays.toString(copy));
		
		arr = new int[] {3, 1, 6, 2, 4, 7};
		copy = new int[arr.length]; //복사할 배열의 길이만큼 배열 선언
		
		//System.arraycopy(원본배열, 복사시작인덱스, 복사할배열, 복사할배열시작인덱스, 복사할데이터개수)
		System.arraycopy(arr, 0, copy, 0, arr.length);
		copy[1] = 99;
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copy : " + Arrays.toString(copy));
	}
}