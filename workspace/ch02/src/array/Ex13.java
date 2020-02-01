package array;

public class Ex13 {
	public static void main(String[] args) {
		int [][]arr = new int[3][3];
		int cnt = 0;
		for(int i = 0; i < arr.length; i ++) { //За
			for(int j = arr.length - 1; j > -1; j --) { //ї­
				arr[i][j] = ++cnt;
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
