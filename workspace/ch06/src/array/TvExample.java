package array;

public class TvExample {
	public static void main(String[] args) {
		/* Ŭ������ �ų� �ڷ���
		 * String => Ŭ������ ���� �ڷ���
		 * �迭�� ����� �� �ְڳ�
		 */
		int[] arr = new int[3];
		Tv[] tvArr = new Tv[3]; //Tv��ü�� ���� 3ĭ ¥�� �迭 ����
		
		for(int i = 0; i < tvArr.length; i ++) {
			arr[i] = i + 1;
			tvArr[i] = new Tv(); //�迭�� i������ Tv��ü ����
			tvArr[i].channel = i + 10;
		}
		for(int i = 0; i < tvArr.length; i ++) {
			System.out.print("tvArr[" + i + "] : ");
			tvArr[i].channelUp();
		}
	}

}
