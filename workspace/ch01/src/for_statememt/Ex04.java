package for_statememt;

public class Ex04 {
	public static void main(String[] args) {
		/* ��ø for��
		 * : for�ȿ� �ٸ� for���� �־��ִ� ��
		 * : �ٱ��� for�� �� �� �ݺ��� �� ���� for�� ó������ ������ �ݺ�
		 */
		
		//for ���� �������� �������� >>> for ������ �����
		for(int i = 2; i < 10; i++) {
			System.out.println("----" + i + "��----");
			for(int j = 1; j < 10; j ++)
				System.out.printf("%d x %d = %d\n",i,j,i*j);
		}
	}

}
