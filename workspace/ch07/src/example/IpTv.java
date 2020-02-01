package example;

import java.util.Scanner;

//하위, 서브, 자식 클래스
//extends명령어를 이용하여 Tv클래스를 상속
public class IpTv extends Tv{
	//생성자 x >>> 디폴트 생성자 존재
	//iptv 디폴트 생성자 실행 > tv 디폴트 생성자 실행 > tv 디폴트 생성자 종료 > iptv 디폴트 생성자 종료
	Scanner sc = new Scanner(System.in);
	boolean settopPower = false;
	void settopSwitch() {
		settopPower = !settopPower;
		if(settopPower) {
			System.out.println("셋톱전원이 켜졌습니다.");
		}else {
			System.out.println("셋톱전원이 꺼졌습니다.");
		}
	}
	void search() {
		System.out.print("어떤 프로그램을 보시겠습니까? ");
		String program = sc.next();
		System.out.println(program + "시청");
	}
}
