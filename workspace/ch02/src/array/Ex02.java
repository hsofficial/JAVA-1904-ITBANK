package array;

public class Ex02 {
	public static void main(String[] args) {
		//�迭�� ����� ���ÿ� �ʱ�ȭ(�� ĭ���� ������ �ʿ� �����)
		int[] arr = new int[] {88, 79, 65, 32, 45};
		int[] arr2 = {77, 98, 65, 21, 65}; //����� ���ÿ� �ʱ�ȭ�� new��ɾ� ��������
		int sum = 0;
		
		//�迭�� ����� �̹� ��������ִ� Array�� ��ü���� => ���ο� �޼ҵ峪 �ʵ尡 �����Ѵٴ� ���
		//�迭��.length : �ʵ�(����) => �� ĭ¥�� �迭������ �����ϴ� �ʵ�
		for(int i = 0; i < arr.length; i ++)
			sum += arr[i];
		System.out.println("�հ� : " + sum);
		double avg = sum / (double)arr.length;
		System.out.println("��� : " + avg);
	}
}
