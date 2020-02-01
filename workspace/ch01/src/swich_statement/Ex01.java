package swich_statement;

public class Ex01 {
	public static void main(String[] args) {
		int choice = 2;
		
		switch(choice) {
		case 1:
			System.out.println("테란");
			break;
		case 2:
			System.out.println("저그");
			break;
		case 3:
			System.out.println("프로토스");
			break;
		default: //else문과 동일
			System.out.println("그 밖에..");
		}
	}
}
