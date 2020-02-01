package ch08;

public class TimeExample {
	public static void main(String[] args) {
		String str = new String("토닥토");
		String str2 = new String("힘내힘");
		if(str.equals(str2))	//참조타입은 주소로 비교
			System.out.println("같아요");
		else
			System.out.println("달라요");
		
		Time aPlan = new Time(3, 30, 0);
		Time bPlan = new Time(3, 30, 0);
		
		//Object.equals() : 모든클래스는 Object클래스를 상속받아요
		//내가 알고있는 타입의 내용물만 비교(기본타입) => String, Integer
		
		if(aPlan.equals(bPlan)) {
			System.out.println("같아요");
		}
		else {
			System.out.println("달라요");
		}
	}
}
