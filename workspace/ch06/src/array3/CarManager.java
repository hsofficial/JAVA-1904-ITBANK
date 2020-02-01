package array3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CarManager {
	private static Scanner sc = new Scanner(System.in);
	private static Car[] cars = new Car[100];
	
	public static void registration() {
		System.out.println("---------------------");
		System.out.println("[ 등록 ]");
		System.out.print("자동차명 : ");
		String carName = sc.next();
		System.out.print("소유자 : ");
		String carOwner = sc.next();
		System.out.print("가격  : ");
		int price = sc.nextInt();
		if(search(carName, carOwner) == null) {
			for(int i = 0; i < cars.length; i++) {
				//배열의 제일 앞에서부터 시작해서 빈공간에 객체를 넣어줍니다.
				if(cars[i] == null) {
					cars[i] = new Car(carOwner, carName, price);
					System.out.println("---------------------");
					System.out.println("등록되었습니다.");
					return;
				}
			}
			
		}
		else {
			System.out.println("---------------------");
			System.out.println("기등록 차량");
		}
	}
	
	private static Car search(String carName, String carOwner) {
		//배열의 첫번째 인덱스부터 배열이 비어있지 않으면 계속 반복
		for(int i = 0; cars[i] != null; i ++) {
			if(cars[i].getCarName().equals(carName) &&
					cars[i].getOwnerName().equals(carOwner))
				return cars[i]; //맞는 데이터를 찾았으면 그 객체를 반환
		}
		return null;//못찾았으면 null을 반환
	}

	public static void remove() {
		System.out.println("---------------------");
		System.out.println("[ 폐기 ]");
		System.out.print("자동차명 : ");
		String carName = sc.next();
		System.out.print("소유자 : ");
		String carOwner = sc.next();
		if(search(carName, carOwner) != null) { //맞는 객체를 찾았을때
			int cnt = 0;
			while(cars[cnt] != null)
				cnt++;
			cnt--;
			for(int i = 0; cars[i] != null; i++) {
				if(cars[i].getCarName().equals(carName) && cars[i].getOwnerName().equals(carOwner)) {
					//맨뒤의 자동차 객체를 현재 위치에 덮어씌움
					cars[i] = cars[cnt];
					//맨뒤의 객체제거
					cars[cnt] = null;
					System.out.println("---------------------");
					System.out.println("폐차가 완료되었습니다.");
					return;
				}
					
			}

		}
		else {
			System.out.println("---------------------");
			System.out.println("등록되지 않은 차량");
		}
	}

	public static void changeprice() {
		System.out.println("---------------------");
		System.out.println("[ 가격변경 ]");
		System.out.print("자동차명 : ");
		String carName = sc.next();
		System.out.print("소유자 : ");
		String carOwner = sc.next();
		Car car = search(carName, carOwner); //car에 search 저장
		if(car != null){
			System.out.println("---------------------");
			System.out.print("변경 가액 : ");
			int price = sc.nextInt();
			car.setPrice(price);
			System.out.println("---------------------");
			System.out.println("가격을 변경했습니다.");
			
		}
		else {
			System.out.println("---------------------");
			System.out.println("등록되지 않은 차량");
		}
		
	}

	public static void list() {
		System.out.println("---------------------");
		System.out.println("[ 목록출력 ]");
		for(int i = 0; cars[i] != null; i++) {
			cars[i].info();
		}
	}
}
