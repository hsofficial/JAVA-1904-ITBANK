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
		
		//����Ҷ� => ������ �ݺ����� ��� => ������ ���� 
		//ArraysŬ������ toString�޼ҵ� : �迭�� ���� ���ڿ�"[��1, ��2]"�� ��ȯ
		System.out.println("intArr1 : " + Arrays.toString(intArr1));
		System.out.println("intArr2 : " + Arrays.toString(intArr2));
	}
}
