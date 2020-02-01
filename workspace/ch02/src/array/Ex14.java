package array;

public class Ex14 {
	public static void main(String[] args) {
		/* 1 4 7
		 * 2 5 8
		 * 3 6 9
		 */
		int [][]arr = new int[3][3];
		int cnt = 0;
		for(int i = 0; i < arr.length; i ++) { //За
			for(int j = 0; j < arr[i].length; j ++) { //ї­
				arr[j][i] = ++cnt;
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
