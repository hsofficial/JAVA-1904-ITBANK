package for_statememt;

public class Ex04 {
	public static void main(String[] args) {
		/* 중첩 for문
		 * : for안에 다른 for문을 넣어주는 것
		 * : 바깥의 for가 한 번 반복할 때 안의 for는 처음부터 끝까지 반복
		 */
		
		//for 안의 변수들은 지역변수 >>> for 끝나면 사라짐
		for(int i = 2; i < 10; i++) {
			System.out.println("----" + i + "단----");
			for(int j = 1; j < 10; j ++)
				System.out.printf("%d x %d = %d\n",i,j,i*j);
		}
	}

}
