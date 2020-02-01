package array;

public class Ex15 {
	public static void main(String[] args) {
		/* 1 2 3
		 * 6 5 4
		 * 7 8 9
		 */
		int [][]arr = new int[3][3];
		int cnt = 0;
		for(int i = 0; i < arr.length; i ++) { //행
			if(i % 2 == 0) { //짝수 행이면
				for(int j = 0; j < arr[i].length; j ++) { //열
					arr[i][j] = ++cnt;
				}
			}
			else { //홀수 행이면
				for(int j = arr[i].length - 1; j > - 1; j --) { //열
					arr[i][j] = ++cnt;
				}
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
