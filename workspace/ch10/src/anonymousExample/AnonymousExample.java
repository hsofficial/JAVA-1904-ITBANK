package anonymousExample;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous an = new Anonymous();
		
		//클래스 내부의 익명 구현 객체 메소드 실행
		an.worker.sleep();
		
		//클래스 내부의 메소드가 익명 구현 객체를 만들면서 실행
		an.method1();
		
		//메소드의 매개변수에서 익명 구현 객체를 만들면서 실행
		an.method2(new Person() {
			void coding() {
				System.out.println("자바 공부를 합니다.");
			}
			@Override
			void sleep() {
				coding();
				System.out.println("2시에 잡니다.");
			}
		});
	}

}
