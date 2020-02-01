package for_statememt;

public class Ex06 {
	public static void main(String[] args) {
		/* 두 개의 주사위 던졌을 떄 눈의 합이 6이 되는 경우를 출력하시오
		 * (x, y)형태로
		 */
		for(int i = 1; i <= 6 ; i++) {
			for(int j = 1; j<= 6 ; j++) {
				if(i + j == 6)
					System.out.printf("[%d , %d]\n",i,j);				
			}	
		}
	}
}
