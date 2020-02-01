package while_statement;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("돈 입력(,로 여러개 입력) : ");
		String money = sc.nextLine();
		//"500,5000,50000"
		//["500","5000","50000"] => 배열에 저장
		String[] a = money.split(","); //","를 기준으로 문자열을 나눠서 넣을 수 있음
		money = "";
		int m = 0;
		int i = 0;
		while(i < a.length) {	//배열.length : 배열의 길이 반환
			m += Integer.parseInt(a[i]);	//정수형으로 바꿔서 m에 더해줍니다.
			i++;
		}
		System.out.println("총 합계 : "+ m);
		sc.close();
	}

}
