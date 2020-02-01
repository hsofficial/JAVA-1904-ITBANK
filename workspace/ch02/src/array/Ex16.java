package array;

import java.util.Arrays;

public class Ex16 {
	public static void main(String[] args) {
		//자바의 2차원 배열은 계단식 구조를 가질 수 있다.(행마다 다른 열의 개수가 들어갈 수 있다.)
		int [][]arr = new int[3][]; //3행짜리 배열선언
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
