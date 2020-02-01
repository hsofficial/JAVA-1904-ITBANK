package for_statememt;

public class Ex05 {
	/* 중첩 for를 이용하여 방정식 4x + 5y = 50의 모든 해를 구해서
	 * [x, y]형태로 출력해주세요
	 * (단, x와 y는 10이하의 자연수)
	 * 
	 * 
	 */
	public static void main(String[] args) {
		for(int i = 1; i <= 10 ; i++) {
			for(int j = 1; j<= 10 ; j++) {
				if(4*i + 5*j == 50)
					System.out.printf("[%d , %d]\n",i,j);
			}
		}
	}

}
