package array;

public class Ex12 {
	public static void main(String[] args) {
		//2차원 배열 : 행과 열로 이루어진 배열
		//int[행][열]
		int[][] arr = new int[2][3];
		//arr => arr[2] => arr[2][3];
		//arr = [[1, 2, 3],
		//		[4, 5, 6]];
		
		int cnt = 0;
		for(int i = 0; i < arr.length; i ++) { //행의 개수 : 2칸
			for(int j = 0; j < arr[i].length; j ++) { //열의 개수 : 3칸
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
