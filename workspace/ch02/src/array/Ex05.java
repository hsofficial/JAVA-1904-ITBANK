package array;

public class Ex05 {
	public static void main(String[] args) {
		/* ���Ͻ���ġ => ���İ� swap
		 * ���� �迭�� ����� ���߿��� ���� ū ���� max��
		 * ���� �������� min�� �������ּ���
		 */
		int[] scores = {66,11,22,99,88,77};
		int max = scores[0];
		int min = scores[0];
		for(int i = 1; i < scores.length; i ++) {
			if(max < scores[i])
				max = scores[i];
			if(min > scores[i])
				min = scores[i];
		}
		System.out.println("max : " + max + ", min : " + min);
	}
}
