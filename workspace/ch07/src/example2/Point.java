package example2;

//private field;
//private method();
//private constructor();

/* 클래스 : 내가 만든 자료형(내부에 기능이 많아) 구조체
 * 객체 : 클래스로 만든 변수(클래스의 생성자가 만들어 주는거에요)
 * 생성자 : 클래스의 이름과 같은 함수(반환형이 없다) => 내가 안적어주면 디폴트 생성자가 실행(클래스(){})
 * 상속 : 상위클래스의 모든 필드, 메소드를 들고오는 것(상위클래스의 객체를 만들어서 내 객체 내부에 넣어주는것) 
 */

public class Point {
	//default field
	int x;
	int y;
//	Point(){}
	
	Point(int x,int y){	//생성자에 매개변수가 있음
		this.x = x;
		this.y = y;
	}
}
