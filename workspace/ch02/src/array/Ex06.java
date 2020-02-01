package array;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		/* 아래 배열에 저장된 값을 무작위로 섞는 알고리즘을 작성하시오
		 * (Math.random()메소드를 사용)
		 */
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		/* swap알고리즘
		 * int tmp = num1;
		 * num2 = num2;
		 * num2 = tmp;
		 */
		for(int i = 0; i < numbers.length; i ++) {
			int r = (int)(Math.random() * 9);// 0 ~ 8 => 인덱스번호
			int tmp = numbers[i];
			numbers[i] = numbers[r];
			numbers[r] = tmp;
		}
		System.out.println(Arrays.toString(numbers));
	}
}
