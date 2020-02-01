package array;

import java.util.Arrays;

public class Ex09 {
	public static void main(String[] args) {
		/*1.45개의 길이를 가진 int형 배열 생성
		 * 반복문을 이용해 1 ~ 45를 배열의 원소에 순차적으로 저장
		 */
		int[] numbers = new int[45];
		for(int i = 0; i < numbers.length; i ++)
			numbers[i] = i + 1;
		
		//2.위 배열의 저장된 값을 무작위로 섞어주세요
		//Ex06참고
		for(int i = 0; i < numbers.length;i ++) {
			int r = (int)(Math.random() * 45); // 0 ~ 44 의 인덱스번호 저장
			int tmp = numbers[i];
			numbers[i] = numbers[r];
			numbers[r] = tmp;
		}
		System.out.println(Arrays.toString(numbers));
		//3.섞은 배열[45]에서 0번째 인덱스부터 6개를 lotto[]배열에 깊은 복사
		
		int[] lotto = new int[6];
		System.arraycopy(numbers, 0, lotto, 0, 6);
		System.out.println(Arrays.toString(lotto));
		
		//4.로또 배열을 오름차순 정렬하세요
		for(int i = 0; i < lotto.length - 1;  i ++) {
			for(int j = i + 1; j < lotto.length; j ++) {
				if(lotto[i] > lotto[j]) {
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
}
