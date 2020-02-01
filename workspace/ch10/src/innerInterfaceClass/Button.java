package innerInterfaceClass;

//interface 따로 만들지 않고 클래스 내부에 넣어서 동작시킬때
public class Button {
	//중첩 인터페이스
	interface onClickListener{
		void onClick(); //중첩 인터페이스의 추상 메소드
	}
	
	//interface는 자기 자신을 객체로 넣어줄 수 없다
	//자기 interface 구현한 것들을 넣어주어야 한다
	
	onClickListener listener;
	
	void setOnClickListener(onClickListener listener) {
		this.listener = listener; //하위 객체를 listener에게 대입
	}
	
	void touch() {
		listener.onClick(); //추상메소드를 실행
	}
}
