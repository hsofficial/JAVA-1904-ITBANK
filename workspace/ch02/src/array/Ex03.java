package array;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		int[] intArr1 = new int[10];
		int[] intArr2 = new int[10];
		for(int i = 0; i < intArr1.length; i ++)
			intArr1[i] = i + 1;
		for(int i = 0; i < intArr2.length; i ++)
			intArr2[i] = (int)(Math.random() * 10 + 1);
		
		//출력할때 => 무조건 반복문을 사용 => 굉장히 귀찮 
		//Arrays클래스의 toString메소드 : 배열의 값을 문자열"[값1, 값2]"로 변환
		System.out.println("intArr1 : " + Arrays.toString(intArr1));
		System.out.println("intArr2 : " + Arrays.toString(intArr2));
	}
}
