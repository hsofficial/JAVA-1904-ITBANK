package array3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CarManager {
	private static Scanner sc = new Scanner(System.in);
	private static Car[] cars = new Car[100];
	
	public static void registration() {
		System.out.println("---------------------");
		System.out.println("[ ��� ]");
		System.out.print("�ڵ����� : ");
		String carName = sc.next();
		System.out.print("������ : ");
		String carOwner = sc.next();
		System.out.print("����  : ");
		int price = sc.nextInt();
		if(search(carName, carOwner) == null) {
			for(int i = 0; i < cars.length; i++) {
				//�迭�� ���� �տ������� �����ؼ� ������� ��ü�� �־��ݴϴ�.
				if(cars[i] == null) {
					cars[i] = new Car(carOwner, carName, price);
					System.out.println("---------------------");
					System.out.println("��ϵǾ����ϴ�.");
					return;
				}
			}
			
		}
		else {
			System.out.println("---------------------");
			System.out.println("���� ����");
		}
	}
	
	private static Car search(String carName, String carOwner) {
		//�迭�� ù��° �ε������� �迭�� ������� ������ ��� �ݺ�
		for(int i = 0; cars[i] != null; i ++) {
			if(cars[i].getCarName().equals(carName) &&
					cars[i].getOwnerName().equals(carOwner))
				return cars[i]; //�´� �����͸� ã������ �� ��ü�� ��ȯ
		}
		return null;//��ã������ null�� ��ȯ
	}

	public static void remove() {
		System.out.println("---------------------");
		System.out.println("[ ��� ]");
		System.out.print("�ڵ����� : ");
		String carName = sc.next();
		System.out.print("������ : ");
		String carOwner = sc.next();
		if(search(carName, carOwner) != null) { //�´� ��ü�� ã������
			int cnt = 0;
			while(cars[cnt] != null)
				cnt++;
			cnt--;
			for(int i = 0; cars[i] != null; i++) {
				if(cars[i].getCarName().equals(carName) && cars[i].getOwnerName().equals(carOwner)) {
					//�ǵ��� �ڵ��� ��ü�� ���� ��ġ�� �����
					cars[i] = cars[cnt];
					//�ǵ��� ��ü����
					cars[cnt] = null;
					System.out.println("---------------------");
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					return;
				}
					
			}

		}
		else {
			System.out.println("---------------------");
			System.out.println("��ϵ��� ���� ����");
		}
	}

	public static void changeprice() {
		System.out.println("---------------------");
		System.out.println("[ ���ݺ��� ]");
		System.out.print("�ڵ����� : ");
		String carName = sc.next();
		System.out.print("������ : ");
		String carOwner = sc.next();
		Car car = search(carName, carOwner); //car�� search ����
		if(car != null){
			System.out.println("---------------------");
			System.out.print("���� ���� : ");
			int price = sc.nextInt();
			car.setPrice(price);
			System.out.println("---------------------");
			System.out.println("������ �����߽��ϴ�.");
			
		}
		else {
			System.out.println("---------------------");
			System.out.println("��ϵ��� ���� ����");
		}
		
	}

	public static void list() {
		System.out.println("---------------------");
		System.out.println("[ ������ ]");
		for(int i = 0; cars[i] != null; i++) {
			cars[i].info();
		}
	}
}
