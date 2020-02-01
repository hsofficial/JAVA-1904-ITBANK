package array;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		/* 피보나치 수열을 배열의 10번째 칸까지 저장하고 출력하시오
		 * 반복문을 이용해서 앞의 두 수를 더한 다음 수를 배열에 하나씩 순차적으로 저장
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
