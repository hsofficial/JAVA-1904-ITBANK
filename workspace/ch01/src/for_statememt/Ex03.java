package for_statememt;

public class Ex03 {
	public static void main(String[] args) {
		//1 ~ 50������ 3�� ����̰ų� 5�� ����� ������ �հ踦 ���Ͻÿ�
		int sum = 0;
		for(int i = 1; i <= 50; i++) {
			if(i % 3 == 0|| i % 5 == 0)
				sum += i;
		}
		System.out.println(sum);
		
	}

}
