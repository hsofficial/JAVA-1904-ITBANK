package example;

import java.util.Scanner;

//����, ����, �ڽ� Ŭ����
//extends��ɾ �̿��Ͽ� TvŬ������ ���
public class IpTv extends Tv{
	//������ x >>> ����Ʈ ������ ����
	//iptv ����Ʈ ������ ���� > tv ����Ʈ ������ ���� > tv ����Ʈ ������ ���� > iptv ����Ʈ ������ ����
	Scanner sc = new Scanner(System.in);
	boolean settopPower = false;
	void settopSwitch() {
		settopPower = !settopPower;
		if(settopPower) {
			System.out.println("���������� �������ϴ�.");
		}else {
			System.out.println("���������� �������ϴ�.");
		}
	}
	void search() {
		System.out.print("� ���α׷��� ���ðڽ��ϱ�? ");
		String program = sc.next();
		System.out.println(program + "��û");
	}
}
