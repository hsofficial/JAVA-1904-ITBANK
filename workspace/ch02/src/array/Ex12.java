package array;

public class Ex12 {
	public static void main(String[] args) {
		//2���� �迭 : ��� ���� �̷���� �迭
		//int[��][��]
		int[][] arr = new int[2][3];
		//arr => arr[2] => arr[2][3];
		//arr = [[1, 2, 3],
		//		[4, 5, 6]];
		
		int cnt = 0;
		for(int i = 0; i < arr.length; i ++) { //���� ���� : 2ĭ
			for(int j = 0; j < arr[i].length; j ++) { //���� ���� : 3ĭ
				arr[i][j] = ++ cnt;
			}
		}
		for(int i = 0; i < arr.length; i ++) {
			for(int j = 0; j < arr[i].length; j ++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
