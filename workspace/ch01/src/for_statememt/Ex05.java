package for_statememt;

public class Ex05 {
	/* ��ø for�� �̿��Ͽ� ������ 4x + 5y = 50�� ��� �ظ� ���ؼ�
	 * [x, y]���·� ������ּ���
	 * (��, x�� y�� 10������ �ڿ���)
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
