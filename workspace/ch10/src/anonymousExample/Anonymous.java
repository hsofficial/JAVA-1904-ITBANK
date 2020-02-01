package anonymousExample;

public class Anonymous {
	/* 익명 구현 객체 : 객체 생성시에 기능을 변경하고 사용할 수 있는 객체
	 * 선언한 클래스 내부에서만 사용가능
	 * 1회성 클래스 => 안드로이드 개발시 사용
	 */
	
	//Person 상속받아서 기능 추가하고 오버라이딩 하고 싶음
	//그런데 이런 객체를 하나만 만든다 >> 익명 구현 객체
	//1.객체 생성시 익명 구현 객체 선언
	Person worker = new Person() {
		void work() {
			System.out.println("일을 합니다.");
		}
		@Override
		void sleep() {
			work();
			System.out.println("24시에 잡니다.");
		}
	};
	//2.메소드 내부에서 선언
	void method1() {
		Person student = new Person() { //객체를 익명 구현 객체로 재정의
			void game() {
				System.out.println("게임");
			}
			@Override
			void sleep() {
				game();
				System.out.println("1시에 잡니다.");
			}
		};
		student.sleep(); //익명 구현 객체의 sleep 메소드 실행
	}
	//3. 메소드의 매개변수로 선언
	void method2(Person programmer) {//Person programmer = new Person(){ 익명 구현 객체 };
		programmer.sleep();
	}
}
