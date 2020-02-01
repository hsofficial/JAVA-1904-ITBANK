package swich_statement;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("직급 : ");
		String position = sc.nextLine();
		
		//java ver7 부터 string 사용가능
		switch (position) {
		case "사장":
			System.out.println("1억");
			break;
		case "부장":
			System.out.println("5000만원");
			break;
		case "차장":
			System.out.println("4000만원");
			break;
		case "사원":
			System.out.println("3000만원");
			break;
		default: //백
			System.out.println("0원");
			break;
		}
		sc.close();
	}
}
