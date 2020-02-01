package array;

public class Ex05 {
	public static void main(String[] args) {
		/* 데니스리치 => 정렬과 swap
		 * 다음 배열에 저장된 값중에서 가장 큰 값을 max에
		 * 가장 작은값을 min에 저장해주세요
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
